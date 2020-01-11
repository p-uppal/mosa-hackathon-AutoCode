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
				BubbleSort bs = new BubbleSort(isPrivate, func_name);
				functions += bs.toString();
				break;
			case 2:
				MergeSort ms = new MergeSort(isPrivate, func_name);
				functions += ms.toString();
				break;
			default:
				break;
		}
	}
}
