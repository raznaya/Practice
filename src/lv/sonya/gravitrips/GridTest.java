package lv.sonya.gravitrips;

public class GridTest {

	public static void main(String[] args) {
		Grid grid = new Grid();

		// @formatter:off
		grid.coins = new Coin[][] {
			{null, null, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{Coin.O, null, null, null, null, null, null},
			{null, Coin.O, null, null, null, null, null},
			{null, null, null, null, null, null, null},
			{Coin.O, Coin.O, Coin.O, Coin.O, null, null, null},
			};
		// @formatter:on

		System.out.println("X won? " + grid.resolve(Coin.X));
		System.out.println("O won? " + grid.resolve(Coin.O));
		System.out.println("O won? " + grid.resolveDiagonalLeft(Coin.O));
	}
}
