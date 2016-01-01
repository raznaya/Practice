package lv.sonya.books;

import java.util.Comparator;

public class YearComparator implements Comparator<Book> {

	@Override
	public int compare(Book a, Book b) {
		int year1 = a.getYear();
		int year2 = b.getYear();
		if (year1 > year2) {
			return -1;
		} else if (year1 < year2) {
			return 1;
		} else {
			return 0;
		}
	}
}
