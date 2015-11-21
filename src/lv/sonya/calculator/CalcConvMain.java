package lv.sonya.calculator;

public class CalcConvMain {

	public static void main(String[] args) {
		System.out.println("Welcome to calculator and converter program!");

		Calculator calc = new Calculator();
		
		char index;
		double a;
		double b;
		
		do {
			calc.userInput();
			if (index == DIVIDE.getIndex()){
				calc.divide(a, b);
			}
		}
	}

}
