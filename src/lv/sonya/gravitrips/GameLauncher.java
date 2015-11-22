package lv.sonya.gravitrips;

import java.util.Scanner;

public class GameLauncher {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Grid grid = new Grid();
		System.out.println("Hello! Welcome to Gravitrips game!");

		System.out.println("Player 1 choose a color!");
		Coin player1coin = userInput();
		Coin player2coin;
		if (player1coin == Coin.W) {
			player2coin = Coin.R;
		} else {
			player2coin = Coin.W;
		}
		System.out.println("Player 2 is " + player2coin.getDescription() + ".");

		Player p1 = new Player(player1coin);
		Player p2 = new Player(player2coin);

		System.out.println("You see a grid with 7 columns and 6 rows.");
		grid.printGrid();

		int player1number;
		int player2number;

		// TODO: Add resolver.
		while (true) {
			System.out.println("Player 1 - enter column number and throw your coin!");
			player1number = columnNumberInput();
			if (player1number >= 0 && player1number <= 7) {
				grid.putCoin(p1.getCoin(), player1number);
				grid.printGrid();
			}
			System.out.println("Player 2 - enter column number and throw your coin!");
			player2number = columnNumberInput();
			if (player2number >= 0 && player2number <= 7) {
				grid.putCoin(p2.getCoin(), player2number);
				grid.printGrid();
			} else {
				throw new IllegalArgumentException("There are just 7 columns, enter number from 1 to 7!");
			}
		}
	}

	public static Coin userInput() {
		String turn = String.valueOf(scanner.nextLine());
		return Coin.parseByDescription(turn);
	}

	public static int columnNumberInput() {
		int number = Integer.valueOf(scanner.nextLine());
		return number;
	}

}