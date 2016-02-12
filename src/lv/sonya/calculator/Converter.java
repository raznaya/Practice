package lv.sonya.calculator;

import static lv.sonya.calculator.ConvOperations.FEET;
import static lv.sonya.calculator.ConvOperations.INCHES;
import static lv.sonya.calculator.ConvOperations.M;
import static lv.sonya.calculator.ConvOperations.MM;

public class Converter {

	private double numberToConvert;
	private String[] parts;
	private String whatToConvert;
	private String toWhatConvert;

	public Converter(double numberToConvert) {
		this.numberToConvert = numberToConvert;
	}

	public double meterToMillimeters() {
		return numberToConvert * 1000;
	}

	public double millimetersToMeters() {
		return numberToConvert / 100;
	}

	public double FeetToInches() {
		return numberToConvert / 100;
	}

	public double feetToInches() {
		return numberToConvert * 12;
	}

	public double inchesToFeet() {
		return numberToConvert / 12;
	}

	public void performConvertion(String input) {
		parts = input.split(" ");
		numberToConvert = Double.parseDouble(parts[0]);
		whatToConvert = parts[1];
		toWhatConvert = parts[3];
	}

	public double extractOperation() {
		double result = 0;
		if (whatToConvert.equals(M.getIndex()) && toWhatConvert.equals(MM.getIndex())) {
			result = meterToMillimeters();
		}
		if (whatToConvert.equals(MM.getIndex()) && toWhatConvert.equals(M.getIndex())) {
			result = millimetersToMeters();
		}
		if (whatToConvert.equals(FEET.getIndex()) && toWhatConvert.equals(INCHES.getIndex())) {
			result = feetToInches();
		}
		if (whatToConvert.equals(INCHES.getIndex()) && toWhatConvert.equals(FEET.getIndex())) {
			result = inchesToFeet();
		}
		return result;
	}
}
