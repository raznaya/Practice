package lv.sonya.gravitrips;

import java.util.Arrays;

public class Grid {

	private int columns = 7;
	private int rows = 6;

	Coin[][] coins = new Coin[rows][columns];

	public void putCoin(Coin coin, int columnIndex) {
		for (int i = rows - 1; i >= 0; i--) {
			if (coins[i][columnIndex] != null) {
				coins[i][columnIndex] = coin;
				break;
			}
		}
	}

	public void printGrid() {
		for (Coin[] arr : coins) {
			System.out.println(Arrays.toString(arr));
		}
	}
}
