package lv.sonya.matchbox;

import java.util.Arrays;
import java.util.Scanner;

public class MatchboxLauncher {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		String text;

		Matchbox box = new Matchbox();
		box.createMatchbox();
		System.out.println("Hello! Here is a matchbox with " + box.showMatchbox() + " matches.");
		System.out.println("You can open box, remove matches and fire them, add new matches or show how many matches are left");

		do {
			text = scanner.nextLine();
			if (text.equals("open")){
				box.openMatchBox();
				System.out.println("Matchbox is open");
			}
			if (text.equals("add")) {
				System.out.println("How many?");
				int count = Integer.valueOf(scanner.nextLine());
				box.addMatches(count);
			}
			if (text.equals("remove")) {
				System.out.println("How many?");
				int count = Integer.valueOf(scanner.nextLine());
				box.removeMatches(count);
			}
			if (text.equals("close")){
				box.closeMatchBox();
				System.out.println("Matchbox is closes");
				break;
			}
			if (text.equals("show")){
				System.out.println(box.showMatchbox());
			}
		} while (true);

	}

}
