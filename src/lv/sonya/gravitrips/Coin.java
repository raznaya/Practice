package lv.sonya.gravitrips;

public enum Coin {
	X, O;

	public static Coin parseByName(String name) {
		for (Coin m : Coin.values()) {
			if (m.name().equalsIgnoreCase(name)) {
				return m;
			}
		}
		throw new IllegalArgumentException("Name " + name + " not found");
	}

	@Override
	public String toString() {
		return this.name();
	}
}
