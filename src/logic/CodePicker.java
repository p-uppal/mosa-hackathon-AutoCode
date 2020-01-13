package logic;

import java.util.ArrayList;

public class CodePicker {
	String instance_variables;
	String functions;
	String classname;
	
	public CodePicker(String class_n, ArrayList<InstanceVariable> all_inst_vars, 
			ArrayList<Integer> functions_picked, ArrayList<String> function_parameters) {
		classname = class_n;
		functions = "";
		instance_variables = "";
		addInstanceVars();
		
	}
	
	public void addInstanceVars(boolean isPrivate, String var_type, String var_name) {
		instance_variables += "" + (isPrivate? "private" : "public") + " " + var_type + " " + var_name + ";\n";
	}
	
	public void addFunctions(int type, boolean isPrivate) {
		switch (type) {
			case 1:
				Quicksort ms = new Quicksort(isPrivate);
				functions += ms.toString();
				break;
			default:
				break;
		}
	}
}
