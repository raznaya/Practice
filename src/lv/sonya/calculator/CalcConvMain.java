package lv.sonya.calculator;

import static lv.sonya.calculator.Operations.ADDITION;
import static lv.sonya.calculator.Operations.DIVIDE;
import static lv.sonya.calculator.Operations.MULTIPLICATION;
import static lv.sonya.calculator.Operations.SUBSTRACTION;

public class CalcConvMain {

	public static void main(String[] args) {
		System.out.println("Welcome to calculator and converter program!");
		System.out.println("Command options: ");
		System.out.println("Divide - " + DIVIDE.getIndex());
		System.out.println("Multiply - " + MULTIPLICATION.getIndex());
		System.out.println("Substract - " + SUBSTRACTION.getIndex());
		System.out.println("Sum - " + ADDITION.getIndex());

		Calculator calc = new Calculator();

		char index;
		double a;
		double b;

		do {
			index = calc.operationInput();
			a = calc.doubleInput();
			b = calc.doubleInput();
			if (index == DIVIDE.getIndex()) {
				System.out.println(a + "/" + b + "=" + calc.divide(a, b));
			}
			if (index == MULTIPLICATION.getIndex()) {
				System.out.println(a + "*" + b + "=" + calc.multiply(a, b));
			}
			if (index == SUBSTRACTION.getIndex()) {
				System.out.println(a + "-" + b + "=" + calc.substract(a, b));
			}
			if (index == ADDITION.getIndex()) {
				System.out.println(a + "+" + b + "=" + calc.sum(a, b));
			}
		} while (true);
	}
}
