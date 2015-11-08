package lv.sonya.practice;

import java.util.Scanner;

public class IsStringSymmetricalRecursion {

	public static void main(String[] args) {
		System.out.println("Hello! Please input some symmetrical text!");

		Scanner scanner = new Scanner(System.in);
		String text = scanner.nextLine();
		scanner.close();
		char[] charArray = text.toCharArray();
		System.out.println("Result is " + isSymmetrical(charArray, 0, charArray.length - 1));
	}

	public static boolean isSymmetrical(char[] charArray, int first, int last) {
		if (first >= last) {
			return true;
		}
		if (charArray[first] == charArray[last]) {
			return isSymmetrical(charArray, first + 1, last - 1);
		} else {
			return false;
		}
	}

}
