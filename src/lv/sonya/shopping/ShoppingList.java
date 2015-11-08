package lv.sonya.shopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingList {
	static Scanner scanner = new Scanner(System.in);
	static List<String> list = new ArrayList<>();

	public static int userInput() {
		int number;
		number = Integer.valueOf(scanner.nextLine());
		return number;
	}

	public static void addItem() {
		System.out.println("Please add an item!");
		String name = scanner.nextLine();
		list.add(name);
		System.out.println("Item added: " + name);
	}

	public static void listItem() {
		System.out.println(list);
	}

	public static void deleteItem() {
		System.out.println("Name an item to delete!");
		String name = scanner.nextLine();
		list.remove(name);
		System.out.println("Item deleted: " + name);
	}

	public static void saveList() {
		try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get("ShoopingList.txt")))) {
			for (String a : list) {
				writer.println(a);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File saved.");
	}

	public static void loadList() {
		try {
			list = Files.readAllLines(Paths.get("ShoopingList.txt"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("File loaded.");
	}
}
