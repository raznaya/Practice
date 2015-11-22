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

	public boolean resolverHorizontal(Coin coin) {
		int count = 0;
		for (int j = 0; j < rows - 1; j++) {
			for (int i = 0; i < columns - 1; i++) {
				if (coin.equals(coins[j][i])) {
					count = count + 1;
				} else {
					count = 0;
				}
				if (count == 4) {
					return true;
				}
			}
		}
		return false;
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