package lv.sonya.gravitrips;

import java.util.Scanner;

public class GameLauncher {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Grid grid = new Grid();
		System.out.println("Hello! Welcome to Gravitrips game!");

		System.out.println("Player 1 choose a color!");
		Coin player1coin = userInput();
		System.out.println("Player 2 choose a color!");
		Coin player2coin = userInput();

		Player p1 = new Player(player1coin);
		Player p2 = new Player(player1coin);

		System.out.println("You see a grid with 7 columns and 6 rows.");
		grid.printGrid();

	}

	public static Coin userInput() {
		String turn = String.valueOf(scanner.nextLine());
		return Coin.parseByDescription(turn);
	}

}
