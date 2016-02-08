package lv.sonya.calculator;

import java.util.Scanner;

public class User {
	
	static Scanner scanner = new Scanner(System.in);
	
	public static String userInput(){
		String text = scanner.nextLine();
		return text;
	}

}
