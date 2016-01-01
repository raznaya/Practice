package lv.sonya.books;

public class BookTest {

	public static void test() {
		Book sevenHabits = new Book(null, null, 0, 0);
		sevenHabits.setAuthor("Stephen Cove");
		sevenHabits.setPageCount(224);
		sevenHabits.setBookName("Seven Habits");

		Book voinaIMir = new Book("Lev Tolstoy", "War and Peace", 1225, 1869);
		System.out.println(voinaIMir.getBookName() + " author is " + voinaIMir.getAuthor());

		System.out.println(voinaIMir.toString());
		System.out.println(sevenHabits.toString());
	}
}
