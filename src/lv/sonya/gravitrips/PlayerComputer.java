package lv.sonya.gravitrips;

import java.util.Random;

public class PlayerComputer extends AbstractPlayer {

	static Random random = new Random();

	public PlayerComputer(Coin coin) {
		super(coin);
	}

	@Override
	public int chooseColumn(Grid grid) {
		return firstMove();
		// checkConcurent(grid);
		// return columnIndex;
	}

	public static int firstMove() {
		return anyRandomIntRange(random, 1, 7);
	}

	public static int anyRandomIntRange(Random random, int low, int high) {
		int randomInt = random.nextInt(high) + low;
		return randomInt;
	}

	public int checkConcurent(Grid grid) {
		int count = 0;
		int columnIndex = 0;
		for (int j = 0; j <= grid.rows; grid.rows++) {
			for (int i = 0; i < grid.columns; i++) {
				if (coin.equals(grid.coins[j][i])) {
					count = count + 1;
				}
				if (count > 2) {
					columnIndex = i + 1;
				}
			}
		}
		return columnIndex;
	}
}
