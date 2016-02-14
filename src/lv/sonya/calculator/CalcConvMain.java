package lv.sonya.calculator;

public class CalcConvMain {

	User user = new User();
	public static String text;

	public static void main(String[] args) {

		CalcConvMain calcConv = new CalcConvMain();
		System.out.println("Welcome to calculator and converter program!");

		do {
			text = User.userInput();
			calcConv.checkConvertOrCalculate(text);
		} while (true);
	}

	public void checkConvertOrCalculate(String text) {
		try {
			String search = "to";
			if (text.toLowerCase().indexOf(search.toLowerCase()) != -1) {
				Converter converter = new Converter(0);
				converter.performConvertion(text);
				System.out.println("= " + converter.extractOperation());
			} else {
				Calculator calculator = new Calculator(0, 0);
				calculator.performCalculation(text);
				System.out.println("= " + calculator.extractOperation());
			}
		} catch (Exception e) {
		}
	}
}
