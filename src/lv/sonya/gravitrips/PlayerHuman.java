package lv.sonya.gravitrips;

import java.util.Scanner;

public class PlayerHuman extends AbstractPlayer {

	private Scanner scanner;

	public PlayerHuman(Coin coin) {
		super(coin);
		scanner = new Scanner(System.in);
	}

	@Override
	public int chooseColumn() {
		int columnIndex = 0;
		while (true) {
			try {
				columnIndex = Integer.valueOf(scanner.nextLine());
				if (columnIndex < 1 || columnIndex > 7) {
					throw new IllegalArgumentException();
				}
				return columnIndex;
			} catch (Exception e) {
				System.out.println("Please enter number from 1 to 7!");
			}
		}
	}
}
