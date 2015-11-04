package lv.sonya.practice;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input 5 positive numbers!");
		for (int i = 0; i < 5; i++) {

			boolean flag = true;
			while (flag) {
				try {
					numbers[i] = scanner.nextInt();
					if (numbers[i] == 0) {
						throw new IllegalArgumentException("Number must be greater than 0!");
					}
					flag = false;
				} catch (IllegalArgumentException e) {
					// e.printStackTrace();
					System.out.println(e.getMessage());
				}
			}

		}
		int even = 0;
		int odd = 0;
		for (int number : numbers) {
			if (number % 2 == 0) {
				odd++;
			} else {
				even++;
			}

		}
		System.out.println("There are " + odd + " odd numbers and " + even + " even numbers");
		scanner.close();
	}

}
// Eto napisala s podskazkami - rabotaet!
