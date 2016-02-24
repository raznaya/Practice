package lv.sonya.practice;

public class MaxNumber {

	public static void main(String[] args) {
		int number1 = 10;
		int number2 = 11;
		int number3 = 54;
		int temporary;
		
		while(true){
			if(number1 > number2){
				temporary = number1;
			} else {
				temporary = number2;
			} if(temporary > number3){
				//break;
			} else {
				temporary = number3;
			}
			System.out.println("The greatest number is: " + temporary);
			break;
		}
	}
}
