package lv.sonya.gravitrips;

import java.util.Random;

public class PlayerComputer extends AbstractPlayer {

	Random random = new Random();

	public PlayerComputer(Coin coin) {
		super(coin);
	}

	@Override
	public int chooseColumn() {
		// TODO Auto-generated method stub
		return 0;
	}
}
