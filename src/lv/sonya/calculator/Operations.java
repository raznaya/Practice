package lv.sonya.calculator;

public enum Operations {
	
	DIVIDE('d'), MULTIPLICATION('m'), SUBSTRACTION('s'), ADDITION('a');

	private char index;
	
	private Operations(char index){
		this.index = index;
	}
	
	public char getIndex(){
		return index;
	}
}
