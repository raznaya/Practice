package lv.sonya.shopping;

public class Product {

	public String name;
	public double price;
	public String category;

	private static final String DELIMETER = "||";

	public Product(String name, double price, String category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String n) {
		name = n;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double p) {
		price = p;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String c) {
		category = c;
	}

	@Override
	public String toString() {
		return name + DELIMETER + price + DELIMETER + category;
	}

	public static Product fromString(String string) {
		String[] strings = string.split(DELIMETER);
		return new Product(strings[0], Double.valueOf(strings[1]), strings[2]);
	}

}
