package lv.sonya.practice;

import java.util.Scanner;

public class IsStringSymmetricalOrNot {

	public static void main(String[] args) {
		System.out.println("Hello! Please input some symmetrical text!");

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		scanner.close();

		String text2 = new StringBuilder(text).reverse().toString();
		System.out.println("My text is " + text2);

		if (text.equals(text2)) {
			System.out.println("Your text is symmetrical!");
		} else {
			System.out.println("Your text is not symmetrical!");
		}
	}
}
