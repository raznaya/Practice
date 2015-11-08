package lv.sonya.practice;

import java.util.Scanner;

public class ShoppingList {
	static String[] items = new String[10];
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Shopping List program! You can choose some options to do:");
		System.out.println("1.Add an item (You can add up to 10 items)");
		System.out.println("2.List items");
		System.out.println("3.Delete an item");
		System.out.println("4.Save list to file");
		System.out.println("5.Load list from file");
		System.out.println("6.Exit");
		System.out.println("Input the number of option you would like to choose!");

		int number = Integer.valueOf(scanner.nextLine());

		if (number == 1) {
			addItem();
		}
	}

	public static void addItem() {
		System.out.println("Please add an item!");
		String name = scanner.nextLine();
		items[0] = name;
		System.out.println("Item added: " + name);
		scanner.close();
	}

}
