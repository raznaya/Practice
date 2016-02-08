package lv.sonya.calculator;

public enum CalcOperations {
	
	DIVIDE("/"), MULTIPLICATION("*"), SUBSTRACTION("-"), ADDITION("+");

	private String index;
	
	private CalcOperations(String index){
		this.index = index;
	}
	
	public String getIndex(){
		return index;
	}
	
	
	
	
	
	
}
