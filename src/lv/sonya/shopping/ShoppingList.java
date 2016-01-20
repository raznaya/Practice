package lv.sonya.shopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ShoppingList {

	private List<Product> products = new ArrayList<>();

	public void add(Product product) {
		products.add(product);
	}

	public List<Product> getProducts() {
		return products;
	}

	public void delete(String name) {
		Iterator<Product> iterator = products.iterator();
		while (iterator.hasNext()) {
			Product product = iterator.next();
			if (name.equals(product.getName())) {
				iterator.remove();
			}
		}
	}

	public void saveProducts() {
		try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(Paths.get("ShoppingList.txt")))) {
			for (Product a : products) {
				writer.println(a);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadProducts() {
		products.clear();
		try {
			List<String> strings = Files.readAllLines(Paths.get("ShoppingList.txt"));
			for (String string : strings) {
				products.add(Product.fromString(string));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
