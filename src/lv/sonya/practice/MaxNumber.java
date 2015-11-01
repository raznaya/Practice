package lv.sonya.practice;

public class MaxNumber {

	public static void main(String[] args) {
			int number1 = 3;
			int number2 = 8;
			int number3 = 1;
			int maxnumber;
			
			while(true){
			if (number1 == number2 && number2 == number3){
				System.out.println("Numbers are equal.");
				break;
			}
			maxnumber = number1;
			if(maxnumber > number2 && maxnumber > number3){
			} else {
				maxnumber = number2;
				if (maxnumber > number1 && maxnumber > number3) {
				} else {
					maxnumber = number3;
					if ( maxnumber > number1 && maxnumber > number2) {
					}
				}
			}
			System.out.println("The greatest number is: " + maxnumber);
			break;
		}
	}
}

