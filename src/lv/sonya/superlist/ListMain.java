package lv.sonya.superlist;

public class ListMain {

	public static void main(String[] args) {

		SuperList list = new SuperList();
		list.add(3);
		list.add(5);
		list.add(4);
		list.add(8);

		list.print();

		list.remove(2);

		list.print();

	}

}
