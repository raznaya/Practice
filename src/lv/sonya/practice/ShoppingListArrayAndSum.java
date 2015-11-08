package lv.sonya.practice;

import java.util.Arrays;
import java.util.Scanner;

public class ShoppingListArrayAndSum {

	public static void main(String[] args) {
		System.out.println(
				"Hello! I`m am Shopping List Program! Add some items, their cost and I`ll sum the total amount of money you need to spend.");
		Scanner scanner = new Scanner(System.in);
		String[] nameArray = new String[5];
		int[] costArray = new int[5];

		for (int a = 0; a < 5; a++) {
			System.out.println("Enter name: ");
			nameArray[a] = scanner.nextLine();
			System.out.println("Enter cost: ");
			costArray[a] = Integer.valueOf(scanner.nextLine());
		}
		System.out.println(Arrays.toString(nameArray));
		System.out.println(Arrays.toString(costArray));

		int sum = 0;
		for (int a = 0; a < costArray.length; a++) {
			sum = sum + costArray[a];
		}
		System.out.println("Total cost is " + sum);
		scanner.close();
	}
}
