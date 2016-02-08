package lv.sonya.calculator;


public class CalcConvMain {
	
	static User user = new User();
	
	public static void main(String[] args) {
		System.out.println("Welcome to calculator and converter program, select calc or conv!");
		chooseConvOrCalc();
}
	
	
	public static void chooseConvOrCalc(){
		String text = User.userInput();
		if(text.equals("calculator")){
			Calculator calculator = new Calculator(0, 0);
			while(true){
				System.out.println("Write down operation!");
				calculator.performCalculation();
				}
		} else {
			if(text.equals("converter")){
				Converter converter = new Converter(0);
				while(true){
					System.out.println("Write down operation!");
					converter.performConvertion();
					}
			}
		}
	}
	
	
	
}
