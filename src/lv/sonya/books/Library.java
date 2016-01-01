package lv.sonya.books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {

	public static void main(String[] args) {
		Book voinaIMir = new Book("Lev Tolstoy", "War and Peace", 1225, 1869);
		Book vlastelinKolec = new Book("J.R.R.Tolkien", "The Lord of the Rings", 1137, 1954);
		Book prestuplenieINakozanie = new Book("Fedor Dostoevsky", "Crime and Punishment", 574, 1866);
		Book belijKonjNaPrince = new Book("Darya Doncova", "White Horse on a Prince", 150, 2009);

		List<Book> myLibrary = new ArrayList<>();

		myLibrary.add(voinaIMir);
		myLibrary.add(vlastelinKolec);
		myLibrary.add(prestuplenieINakozanie);
		myLibrary.add(belijKonjNaPrince);

		Collections.sort(myLibrary, new PageCountComparator());
		for (Book a : myLibrary) {
			System.out.println(a.getBookName() + " " + a.getPageCount() + " pages");
		}

		System.out.println("----------------------------");

		Collections.sort(myLibrary, new YearComparator());
		for (Book a : myLibrary) {
			System.out.println(a.getBookName() + " " + a.getYear() + " year");
		}

		System.out.println("----------------------------");

	}
}
