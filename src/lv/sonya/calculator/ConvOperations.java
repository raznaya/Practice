package lv.sonya.calculator;

public enum ConvOperations {
	MM("mm"), M("m"), FEET("feet"), INCHES("inches");

	private String index;

	private ConvOperations(String index) {
		this.index = index;
	}

	public String getIndex() {
		return index;
	}
}
