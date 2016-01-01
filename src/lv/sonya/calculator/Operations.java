package lv.sonya.calculator;

public enum Operations {
	
	DIVIDE("/"), MULTIPLICATION("*"), SUBSTRACTION("-"), ADDITION("+");

	private String index;
	
	private Operations(String index){
		this.index = index;
	}
	
	public String getIndex(){
		return index;
	}
}
