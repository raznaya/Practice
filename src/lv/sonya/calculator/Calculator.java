package lv.sonya.calculator;

import static lv.sonya.calculator.CalcOperations.DIVIDE;
import static lv.sonya.calculator.CalcOperations.ADDITION;
import static lv.sonya.calculator.CalcOperations.SUBSTRACTION;
import static lv.sonya.calculator.CalcOperations.MULTIPLICATION;

public class Calculator {

	
	private static String[] parts;
	private static double number1;
	private  static double number2;
	
	public Calculator(double number1, double number2){
		Calculator.number1 = number1;
		Calculator.number2 = number2;
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

	public static void operationInput() {
		String input = User.userInput();
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

	public void performCalculation() {
		operationInput();
		System.out.println("= " + extractOperation());
	}
}
