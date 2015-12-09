package lv.sonya.gravitrips;

public class Grid {

	int columns = 7;
	int rows = 6;

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

	public boolean resolveHorizontal(Coin coin) {
		for (int j = 0; j < rows; j++) {
			int count = 0;
			for (int i = 0; i < columns; i++) {
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

	public boolean resolveVertical(Coin coin) {
		for (int j = columns - 1; j >= 0; j--) {
			int count = 0;
			for (int i = rows - 1; i >= 0; i--) {
				if (coin.equals(coins[i][j])) {
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

	public boolean resolveDiagonalRight(Coin coin) {
		for (int diagonal = 0; diagonal <= 2 * (columns - 1); ++diagonal) {
			int count = 0;
			int rMin = Math.max(0, diagonal - columns + 1);
			int rMax = Math.min(rows - 1, diagonal);
			for (int r = rMin; r <= rMax; ++r) {
				int c = diagonal - r;
				if (coin.equals(coins[r][c])) {
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

	public boolean resolveDiagonalLeft(Coin coin) {
		for (int k = 0; k < columns; k++) {
			int count = 0;
			for (int i = 0; i < rows; i++) {
				if (i + k > columns - 1) {
					break;
				}
				if (coin.equals(coins[i][i + k])) {
					count = count + 1;
				} else {
					count = 0;
				}
				if (count == 4) {
					return true;
				}
			}
		}
		for (int k = 1; k < rows; k++) {
			int count = 0;
			for (int i = 0; i < columns; i++) {
				if (i + k > rows - 1) {
					break;
				}
				if (coin.equals(coins[i + k][i])) {
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

	public boolean resolve(Coin coin) {
		return resolveHorizontal(coin) || resolveVertical(coin) || resolveDiagonalRight(coin)
				|| resolveDiagonalLeft(coin);
	}

	public void printGrid() {
		System.out.println(" 1 2 3 4 5 6 7 ");
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
		System.out.println(" 1 2 3 4 5 6 7 ");
	}
}