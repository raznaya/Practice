package lv.sonya.shopping;

import static lv.sonya.shopping.Menu.ADD;
import static lv.sonya.shopping.Menu.DELETE;
import static lv.sonya.shopping.Menu.EXIT;
import static lv.sonya.shopping.Menu.LOAD;
import static lv.sonya.shopping.Menu.PRINT;
import static lv.sonya.shopping.Menu.SAVE;

import java.util.Scanner;

public class ShoppingMain {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Welcome to Shopping List program! You can choose some options to do:");
		System.out.println(ADD.getIndex() + " - Add an item (You can add up to 10 items)");
		System.out.println(PRINT.getIndex() + " - List items");
		System.out.println(DELETE.getIndex() + " - Delete an item");
		System.out.println(SAVE.getIndex() + " - Save list to file");
		System.out.println(LOAD.getIndex() + " - Load list from file");
		System.out.println(EXIT.getIndex() + " - Exit");
		System.out.println("Input the number of option you would like to choose!");

		int number;
		do {
			number = ShoppingList.userInput();
			if (number == ADD.getIndex()) {
				ShoppingList.addItem();
			}
			if (number == PRINT.getIndex()) {
				ShoppingList.listItem();
			}
			if (number == DELETE.getIndex()) {
				ShoppingList.deleteItem();
			}
			if (number == SAVE.getIndex()) {
				ShoppingList.saveList();
			}
			if (number == LOAD.getIndex()) {
				ShoppingList.loadList();
			}

		} while (EXIT.getIndex() != number);
		scanner.close();
	}

}
