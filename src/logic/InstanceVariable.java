package logic;

public class InstanceVariable {
	boolean isPrivate;
	String var_type;
	String var_name;
	
	public InstanceVariable(boolean isPrivate, String var_type, String var_name) {
		this.isPrivate = isPrivate;
		this.var_type = var_type;
		this.var_name = var_name;
	}

	public boolean getIsPrivate() {
		return isPrivate;
	}

	public String getVar_type() {
		return var_type;
	}

	public String getVar_name() {
		return var_name;
	}
	
}
