package lv.sonya.calculator;
import java.util.Scanner;

public class Numbers {
	double number1;
	double number2;
	String operation;
	static Scanner scanner = new Scanner(System.in);
	
	public static String userInput(){
		String s = scanner.nextLine();
		return s;
	}
	
	public void operationInput() {
		String s = userInput();
		String parts[] = s.split(" ");
		number1 = Integer.parseInt(parts[0]);
		operation = parts[1];
		number2 = Integer.parseInt(parts[2]);
	}
}
