package lv.sonya.practice;

public class OddEven {

	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,0,7,8,9,10};
		int even = 0;
		int odd = 0;
		for (int number : numbers){
			if (number == 0){
			break;
			}
			if (number % 2 == 0){
				odd++;
			} else { 
				even++;
			}
		}
		System.out.println("There are " + odd + " odd numbers and " + even + " even numbers");
	}

}
// Eto napisala s podskazkami - rabotaet!
