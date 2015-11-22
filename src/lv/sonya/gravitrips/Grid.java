package lv.sonya.gravitrips;

public class Grid {

	private int columns = 7;
	private int rows = 6;

	Coin[][] coins = new Coin[rows][columns];

	public void putCoin(Coin coin, int columnIndex) {
		columnIndex = columnIndex - 1;
		for (int i = rows - 1; i >= 0; i--) {
			if (coins[i][columnIndex] == null) {
				coins[i][columnIndex] = coin;
				break;
			}
		}
	}

	public void printGrid() {
		for (Coin[] row : coins) {
			String rowString = "|";
			for (Coin coin : row) {
				if (coin == null) {
					rowString += " |";
				} else {
					rowString += coin + "|";
				}
			}
			System.out.println(rowString);
		}
	}
}
