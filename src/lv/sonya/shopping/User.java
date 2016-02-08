package lv.sonya.shopping;

import static lv.sonya.shopping.Menu.ADD;
import static lv.sonya.shopping.Menu.EXIT;

import java.util.Scanner;

public class User {

	static Scanner scanner = new Scanner(System.in);

	public String userInput() {
		String text;
		text = scanner.nextLine();
		return text;
	}

	public double userDoubleInput() {
		double number = Double.valueOf(scanner.nextLine());
		while (number <= 0) {
			System.out.println("Please enter number greater than or equal to 0!");
			try {
				number = Double.valueOf(scanner.nextLine());
			} catch (Exception e) {
				// do nothing
			}
		}
		return number;
	}

	public int userCommandInput() {
		int number = 0;
		int commandFirst = ADD.getIndex();
		int commandLast = EXIT.getIndex();
		while (number < commandFirst || number > commandLast) {
			System.out.println("Please enter number from " + commandFirst + " to " + commandLast);
			try {
				number = Integer.valueOf(scanner.nextLine());
			} catch (Exception e) {
				// do nothing
			}
		}
		return number;
	}

}
