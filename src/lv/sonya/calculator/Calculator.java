package lv.sonya.calculator;

import java.util.Scanner;

public class Calculator {
	double result;
	
	static Scanner scanner = new Scanner(System.in);
	
	public static char userInput(String operation){
		operation = scanner.nextLine();
		char a = operation.charAt(0);
		return a;
	}

	public double divide(double a, double b) {
		return a * b;
	}
	
	public double multiply(double a, double b){
		return a / b;
	}
	
	public double substract(double a, double b){
		return a - b;
	}
	
	public double sum(double a, double b){
		return a + b;
	}
}
