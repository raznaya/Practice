package lv.sonya.calculator;

import static lv.sonya.calculator.CalcOperations.ADDITION;
import static lv.sonya.calculator.CalcOperations.DIVIDE;
import static lv.sonya.calculator.CalcOperations.MULTIPLICATION;
import static lv.sonya.calculator.CalcOperations.SUBSTRACTION;

public class Calculator {

	private String[] parts;
	private double number1;
	private double number2;

	public Calculator(double number1, double number2) {
		this.number1 = number1;
		this.number2 = number2;
	}

	public double divide() {
		return number1 / number2;
	}

	public double multiply() {
		return number1 * number2;
	}

	public double substract() {
		return number1 - number2;
	}

	public double sum() {
		return number1 + number2;
	}


	public void performCalculation(String input) {

		parts = input.split(" ");
		number1 = Double.parseDouble(parts[0]);
		number2 = Double.parseDouble(parts[2]);
	}

	public double extractOperation() {
		String operation = parts[1];
		double result = 0;
		if (operation.equals(DIVIDE.getIndex())) {
			result = divide();
		} else {
			if (operation.equals(MULTIPLICATION.getIndex())) {
				result = multiply();
			} else {
				if (operation.equals(SUBSTRACTION.getIndex())) {
					result = substract();
				} else {
					if (operation.equals(ADDITION.getIndex())) {
						result = sum();
					}
				}
			}
		}
		return result;

	}
}
