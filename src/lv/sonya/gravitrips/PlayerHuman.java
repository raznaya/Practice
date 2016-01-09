package lv.sonya.gravitrips;

import java.util.Scanner;

public class PlayerHuman extends AbstractPlayer {

	private Scanner scanner;

	public PlayerHuman(Coin coin) {
		super(coin);
		scanner = new Scanner(System.in);
	}

	@Override
	public int chooseColumn(Grid grid) {
		int columnIndex = 0;
		while (columnIndex < 1 || columnIndex > 7) {
			System.out.println("Please enter number from 1 to 7!");
			try {
				columnIndex = Integer.valueOf(scanner.nextLine());
			} catch (Exception e) {
				// do nothing
			}
		}
		return columnIndex;
	}
}
