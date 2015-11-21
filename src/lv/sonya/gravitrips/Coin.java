package lv.sonya.gravitrips;

public enum Coin {

	R("red"), W("white");

	private String description;

	private Coin(String description) {
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public static Coin parseByDescription(String description) {
		for (Coin m : Coin.values()) {
			if (m.getDescription().equals(description)) {
				return m;
			}
		}
		throw new IllegalArgumentException("Description " + description + " not found");
	}

	@Override
	public String toString() {
		return this.name();
	}
}
