package lv.sonya.calculator;

public class Converter {

	private static double numberToConvert;
	private static String[] parts;
	private static String whatToConvert;
	private static String toWhatConvert;

	public Converter( double numberToConvert){
		Converter.numberToConvert = numberToConvert;
	}
	
	public double meterToMilimeters() {
		return numberToConvert * 1000;
	}
	
	public static void operationInput() {
		
		String input = User.userInput();
		parts = input.split(" ");
		numberToConvert = Double.parseDouble(parts[0]);
		whatToConvert = parts[1];
		toWhatConvert = parts[3];
	}
	
	public double extractOperation(){
		double result = 0;
		if(whatToConvert.equals("m") && toWhatConvert.equals("mm")){
			result = meterToMilimeters();
		} return result;
	}
	
	public void performConvertion(){
		operationInput();
		System.out.println("= " + extractOperation());
	}
}
