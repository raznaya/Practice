package lv.sonya.practice;

import java.util.Scanner;

public class ProgramGuess {

	public static void main(String[] args) {
		System.out.println("Player needs to think of a number between 0 and 100");
		int max = 100;
		int min = 0;
		int n = (min + max) / 2;
		System.out.println("I think it`s " + n);
		Scanner scanner = new Scanner(System.in);
		String text;
		System.out.println("What would you say? (Smaller or larger or correct number?)");

		while (true) {
			text = scanner.nextLine();
			if (text.equalsIgnoreCase("smaller")) {
				max = n;
			}
			if (text.equalsIgnoreCase("larger")) {
				min = n;
			}
			if (text.equalsIgnoreCase("correct number")) {
				System.out.println("I guessed!");
				break;
			}
			if (max - min <= 1) {
				System.out.println("Don`t fool me!");
				break;
			}
			n = (min + max) / 2;
			System.out.println("I think it`s " + n);
		}
		scanner.close();
	}
} // sdelala s podskazkami - rabotaet :)
