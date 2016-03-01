package lv.sonya.matchbox;

import java.util.Collection;
import java.util.HashSet;
import java.util.Scanner;

public class MatchboxLauncher {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text;

		SimpleMatchbox box = new SimpleMatchbox();
		System.out.println("Hello! Here is a matchbox with " + box.countMatches() + " matches.");
		System.out.println(
				"You can open box, take one or many matches and fire one, put new matches or show how many matches are left and close box");

		do {
			text = scanner.nextLine();
			if (text.equals("open")) {
				box.open();
				System.out.println("Matchbox is open");
			}
			if (text.equals("put")) {
				System.out.println("How many?");
				int count = Integer.valueOf(scanner.nextLine());
				Collection<Match> temporary = new HashSet<>();
				for (int i = 0; i < count; i++) {
					temporary.add(new Match());
				}
				box.putMatches(temporary);
				System.out.println("There are now +" + count + " in the box");
			}
			if (text.equals("take many")) {
				System.out.println("How many?");
				int count = Integer.valueOf(scanner.nextLine());
				box.takeMatches(count);
			}
			if (text.equals("take one")) {
				System.out.println("How many?");
				box.takeMatch();
			}
			if (text.equals("close")) {
				box.close();
				System.out.println("Matchbox is closed");
			}
			if (text.equals("count")) {
				System.out.println(box.countMatches());
			}
		} while (true);

	}

}
