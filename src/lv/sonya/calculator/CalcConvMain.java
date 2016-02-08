package lv.sonya.calculator;

public class CalcConvMain {

	static User user = new User();

	public static void main(String[] args) {
		System.out.println("Welcome to calculator and converter program!");
		chooseConvOrCalc();
	}

	public static void chooseConvOrCalc() {
		while (true) {
			System.out.println("Calculator or converter?");
			try {
				String text = User.userInput();
				if (text.equals("calculator")) {
					Calculator calculator = new Calculator(0, 0);
					calculator.performCalculation();
				}
				if (text.equals("converter")) {
					Converter converter = new Converter(0);
					converter.performConvertion();
				}
			} catch (Exception e) {
				// do nothing
			}
		}
	}

}
