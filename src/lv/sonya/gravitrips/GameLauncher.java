package lv.sonya.gravitrips;

import static lv.sonya.gravitrips.Coin.*;
import java.util.Scanner;

public class GameLauncher {

	private static Scanner scanner = new Scanner(System.in);
	private static Grid grid = new Grid();

	public static void gameLauncher() {

		System.out.println("Hello! Welcome to Gravitrips game!");
		System.out.println("Player 1 choose your coin - " + X + " or " + O);

		Coin p1coin = chooseCoin();
		Coin p2coin = p1coin.getOtherCoin();

		System.out.println("Player 2 is " + p2coin + ".");

		Player p1 = new PlayerHuman(p1coin);

		System.out.println("Choose your opponent - human or computer.");
		Player p2 = choosePlayer(p2coin);

		System.out.println("You see a grid with 7 columns and 6 rows.");
		grid.printGrid();

		boolean gameCompleted = false;
		while (!gameCompleted) {
			gameCompleted = makeMove(p1, "Player 1") || makeMove(p2, "Player 2");
		}
	}

	private static boolean makeMove(Player player, String name) {
		System.out.println(name + ", enter column number and throw your coin!");
		int columnIndex = player.chooseColumn(grid);
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

	private static Player choosePlayer(Coin coin) {
		String name = String.valueOf(scanner.nextLine());
		if (name.equals("computer")) {
			return new PlayerComputer(coin);
		} else if (name.equals("human")) {
			return new PlayerHuman(coin);
		}
		throw new IllegalArgumentException("Enter computer or human");
	}
}