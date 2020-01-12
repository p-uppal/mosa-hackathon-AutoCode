package logic;

public class CodePicker {
	String instance_variables;
	String functions;
	String classname;
	
	public CodePicker(String class_n) {
		classname = class_n;
	}
	
	public void addInstanceVar(boolean isPrivate, String var_type, String var_name) {
		instance_variables += "" + (isPrivate? "private" : "public") + " " + var_type + " " + var_name + ";\n";
	}
	
	public void addFunction(int type, boolean isPrivate, String func_name) {
		switch (type) {
			case 1:
				Quicksort ms = new Quicksort(isPrivate, func_name);
				functions += ms.toString();
				break;
			default:
				break;
		}
	}
}
