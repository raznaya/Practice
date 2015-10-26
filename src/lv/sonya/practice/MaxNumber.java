package lv.sonya.practice;

public class MaxNumber {

	public static void main(String[] args) {
		int number1 = 15;
		int number2 = 8;
		int number3 = 47;
		int maxnumber;
		
		maxnumber = number1;
		if(maxnumber >2 && maxnumber > number3){
			System.out.println("Number 1 is the greatest: " + maxnumber);
		} else {
			maxnumber = number2;
			if (maxnumber > number1 && maxnumber > number3) {
				System.out.println("Number 2 is the greatest: " + maxnumber);
			} else {
				maxnumber = number3;
				if ( maxnumber > number1 && maxnumber > number2) {
					System.out.println("Number 3 is the greatest: " + maxnumber);
				}
			}
		}
	}
	//Programma rabotaet, eto ja napisala sama, bez podskazok :)
}
