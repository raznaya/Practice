package lv.sonya.books;

import java.util.Comparator;

public class PageCountComparator implements Comparator<Book> {

	@Override
	public int compare(Book a, Book b) {
		int pageCount1 = a.getPageCount();
		int pageCount2 = b.getPageCount();

		if (pageCount1 > pageCount2) {
			return -1;
		} else if (pageCount1 < pageCount2) {
			return 1;
		} else {
			return 0;
		}
	}

}
