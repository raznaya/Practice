package lv.sonya.gravitrips;

public abstract class AbstractPlayer implements Player {

	protected Coin coin;

	public AbstractPlayer(Coin coin) {
		this.coin = coin;
	}

	@Override
	public Coin getCoin() {
		return coin;
	}
}
