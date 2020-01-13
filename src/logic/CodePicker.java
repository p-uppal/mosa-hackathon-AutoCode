package logic;
import writing.WriteJava;

import java.io.IOException;
import java.util.ArrayList;

public class CodePicker {
	String instance_variables;
	String functions;
	String classname;
	String finalString;
	
	public CodePicker(String class_n, ArrayList<InstanceVariable> all_inst_vars, 
			ArrayList<Integer> functions_picked, ArrayList<String> function_parameters) {
		classname = class_n;
		functions = "";
		instance_variables = "";
		addInstanceVars(all_inst_vars);
		addFunctions(functions_picked, function_parameters);
		buildFinalString();
	}
	
	public CodePicker(String class_n,ArrayList<Integer> functions_picked, ArrayList<String> function_parameters) {
		classname = class_n;
		functions = "";
		instance_variables = "";
		addFunctions(functions_picked, function_parameters);
		buildFinalString();

	}
	
	public boolean publishString(String file_address) {
		String final_address = fixAddress(file_address);
		try {
			WriteJava.writeToFile(finalString,final_address);
			return true;
		}
		catch (IOException e) {
			e.printStackTrace();
			return false;
		}
	}
	
	private String fixAddress(String file_address) {
		String sub = file_address.substring(file_address.length()-1);
		
		if (sub.equals("/") || sub.equals("\\")) {
			return file_address + classname.trim() + ".java";
		}
		else {
			return file_address + "\\" + classname.trim() + ".java";
		}
	}

	public void buildFinalString() {
		finalString = "public class " + classname + " {\n"
				+ instance_variables
				+ functions
				+"}\n";
	}
	
	public void addInstanceVars( ArrayList<InstanceVariable> inst_vars) {
		if (inst_vars.isEmpty()) {
			return;
		}
		
		for (InstanceVariable iv : inst_vars) {
			instance_variables += "\t" + (iv.getIsPrivate() ? "private" : "public") 
					+ " " + iv.getVar_type() + " " + iv.getVar_name() + ";\n";
		}
		instance_variables += "\n";
	}
		
	public void addFunctions(ArrayList<Integer> functions_picked, ArrayList<String> function_parameters) {
		int constr_counter = 0;
		Quicksort qs = new Quicksort();
		FileRW frw = new FileRW();
		
		for (int func : functions_picked) {
			switch (func) {
			case 1:
				functions += getConstructorString(classname, function_parameters.get(constr_counter));
				constr_counter++;
				break;
			case 2:
				functions += qs.toString();
				break;
			case 3:
				functions += frw.getRWString(1);
				break;
			case 4:
				functions += frw.getRWString(2);
				break;
			case 5:
				functions += frw.getRWString(3);
				break;
			case 6:
				functions += frw.getRWString(4);
				break;
			default:
				break;
			}
		}

	}

	private String getConstructorString(String name, String params) {
		String function_str = "";
		function_str = 
				"\tpublic " + name + "(" + params + ") {\n"
						+ "\t\t\n"
						+ "\t}\n";
		
		return function_str;
	}
}
