package lv.sonya.shopping;

public enum Menu {
	ADD(1), PRINT(2), DELETE(3), SAVE(4), LOAD(5), SEARCHBYPRICE(6), SEARCHBYCATEGORY(7), EXIT(8);

	private int index;

	private Menu(int index) {
		this.index = index;
	}

	public int getIndex() {
		return index;
	}
}
