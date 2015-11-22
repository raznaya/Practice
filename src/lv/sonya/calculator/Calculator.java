package lv.sonya.calculator;

import java.util.Scanner;

public class Calculator {

	static Scanner scanner = new Scanner(System.in);

	public char operationInput() {
		String operation = scanner.nextLine();
		char a = operation.charAt(0);
		return a;
	}

	public double doubleInput() {
		double number = Double.valueOf(scanner.nextLine());
		return number;
	}

	public double divide(double a, double b) {
		return a / b;
	}

	public double multiply(double a, double b) {
		return a * b;
	}

	public double substract(double a, double b) {
		return a - b;
	}

	public double sum(double a, double b) {
		return a + b;
	}
}
