package lv.sonya.shopping;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lv.sonya.shopping.ShoppingMain;

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
		try {
			List<String> strings = Files.readAllLines(Paths.get("ShoppingList.txt"));
			for (String string : strings) {
				products.add(Product.fromString(string));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void searchByPrice(){
	double number1 = ShoppingMain.enterSmallNumber();
	double number2 = ShoppingMain.enterLargeNumber();
	List<Product> temporary = new ArrayList<>();
	Iterator<Product> iterator = products.iterator();
	while (iterator.hasNext()) {
		Product product = iterator.next();
			if(product.price > number1 && product.price < number2){
			temporary.add(product); 
			}
		} System.out.println(temporary.toString());
	} 
}

