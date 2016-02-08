package lv.sonya.calculator;


public class CalcConvMain {
	
	static User user = new User();
	
	public static void main(String[] args) {
		System.out.println("Welcome to calculator and converter program!");
		
		Calculator calculator = new Calculator(0, 0);
		
		while(true){
		System.out.println("Write down operation!");
		calculator.performCalculation();
		}
	
}
	
	
	
	
}
