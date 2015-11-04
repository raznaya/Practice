package lv.sonya.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ShoppingList {

	public static void main(String[] args) {
		System.out.println(
				"Hello! I`m am Shopping List Program! Add some items, their cost and I`ll sum the total amount of money you need to spend.");
		Scanner scanner = new Scanner(System.in);
		String[] nameArray = new String[5];
		int[] costArray = new int[5];

		for (int a = 0; a < 5; a++) {
			nameArray[a] = scanner.nextLine();
			costArray[a] = scanner.nextInt();
		}
		System.out.print(Arrays.toString(nameArray));
		System.out.print(Arrays.toString(costArray));
		scanner.close();
	}
}
