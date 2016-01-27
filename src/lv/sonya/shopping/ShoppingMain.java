package lv.sonya.shopping;

import static lv.sonya.shopping.Menu.ADD;
import static lv.sonya.shopping.Menu.DELETE;
import static lv.sonya.shopping.Menu.EXIT;
import static lv.sonya.shopping.Menu.LOAD;
import static lv.sonya.shopping.Menu.PRINT;
import static lv.sonya.shopping.Menu.SAVE;
import static lv.sonya.shopping.Menu.SEARCHBYPRICE;
import static lv.sonya.shopping.Menu.SEARCHBYCATEGORY;

public class ShoppingMain {

	static User user = new User();
	static ShoppingList myShoppingList = new ShoppingList();

	public static void main(String[] args) {
		System.out.println("Welcome to Shopping List program! You can choose some options to do:");
		System.out.println(ADD.getIndex() + " - Add an item (You can add up to 10 items)");
		System.out.println(PRINT.getIndex() + " - List items");
		System.out.println(DELETE.getIndex() + " - Delete an item");
		System.out.println(SAVE.getIndex() + " - Save list to file");
		System.out.println(LOAD.getIndex() + " - Load list from file");
		System.out.println(SEARCHBYPRICE.getIndex() + " - Search products by price");
		System.out.println(SEARCHBYCATEGORY.getIndex() + " - Search products by category");
		System.out.println(EXIT.getIndex() + " - Exit");
		System.out.println("Input the number of option you would like to choose!");

		int number;
		do {
			number = user.userCommandInput();
			if (number == ADD.getIndex()) {
				addItem();
			}
			if (number == PRINT.getIndex()) {
				listItem();
			}
			if (number == DELETE.getIndex()) {
				deleteItem();
			}
			if (number == SAVE.getIndex()) {
				saveItem();
			}
			if (number == LOAD.getIndex()) {
				loadItem();
			}
			if (number == SEARCHBYPRICE.getIndex()) {
				searchPrice();
			}
			if (number == SEARCHBYCATEGORY.getIndex()) {
				searchCategory();
			}

		} while (EXIT.getIndex() != number);
	}

	public static void addItem() {
		System.out.println("Please add a product name, price and category!");
		String name = user.userInput();
		System.out.println("Product name added: " + name);
		double price = user.userDoubleInput();
		System.out.println("Product price added: " + price);
		String category = user.userInput();
		System.out.println("Product category added: " + category);

		Product product = new Product(name, price, category);
		myShoppingList.add(product);
	}

	public static void deleteItem() {
		System.out.println("Name an item to delete!!!");
		String name = user.userInput();
		myShoppingList.delete(name);
		System.out.println("Item deleted: " + name);
	}

	public static void listItem() {
		System.out.println(myShoppingList.getProducts());
	}

	public static void saveItem() {
		myShoppingList.saveProducts();
		System.out.println("File saved.");
	}

	public static void loadItem() {
		myShoppingList.loadProducts();
		System.out.println("File loaded.");
	}

	public static void searchPrice() {
		myShoppingList.searchByPrice();
	}
	
	public static void searchCategory() {
		myShoppingList.searchByCategory();
	}

	public static double enterSmallNumber() {
		System.out.println("Enter price range: search from");
		double smallNumber = user.userDoubleInput();
		return smallNumber;
	}

	public static double enterLargeNumber() {
		System.out.println("Enter price range: search to");
		double largeNumber = user.userDoubleInput();
		return largeNumber;
	}

	public static String enterCategory() {
		System.out.println("Enter category name");
		String category = user.userInput();
		return category;
	}

}
