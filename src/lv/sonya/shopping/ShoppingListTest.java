package lv.sonya.shopping;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import lv.sonya.shopping.ShoppingList;

public class ShoppingListTest {

	static List<Product> list = new ArrayList<>();
	ShoppingList myShoppingList = new ShoppingList();

	double price = 1.25;
	Product product1 = new Product("moloko", 1.23, "eda");
	Product product2 = new Product("hleb", 1.00, "eda");
	Product product3 = new Product("banani", 0.99, "eda");

	@Test
	public void testAdd() {
		assertEquals(0, list.size());
		list.add(product1);
		assertEquals(1, list.size());
		list.add(product2);
		assertEquals(2, list.size());
	}

}
