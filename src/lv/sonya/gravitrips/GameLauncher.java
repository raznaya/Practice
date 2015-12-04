package lv.sonya.gravitrips;

import java.util.Scanner;

public class GameLauncher {

	private static Grid grid;
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		grid = new Grid();
		System.out.println("Hello! Welcome to Gravitrips game!");

		System.out.println("Player 1 choose your coin - " + Coin.X + " or " + Coin.O);
		Coin player1coin = chooseCoin();
		Coin player2coin;
		if (player1coin == Coin.O) {
			player2coin = Coin.X;
		} else {
			player2coin = Coin.O;
		}
		System.out.println("Player 2 is " + player2coin + ".");

		Player p1 = new PlayerHuman(player1coin);
		Player p2 = new PlayerHuman(player2coin);

		System.out.println("You see a grid with 7 columns and 6 rows.");
		grid.printGrid();

		while (true) {
			makeMove(p1, "Player 1");
			makeMove(p2, "Player 2");
		}
	}

	private static boolean makeMove(Player player, String name) {
		System.out.println(name + ", enter column number and throw your coin!");
		int columnIndex = player.chooseColumn();
		grid.putCoin(player.getCoin(), columnIndex);
		grid.printGrid();
		if (grid.resolve(player.getCoin()) == true) {
			System.out.println(name + " is winner!");
			return true;
		}
		return false;
	}

	private static Coin chooseCoin() {
		String turn = String.valueOf(scanner.nextLine());
		return Coin.parseByName(turn);
	}
}