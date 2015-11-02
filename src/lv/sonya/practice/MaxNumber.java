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
	
	int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);
		System.out.println("Input 5 positive numbers!");
		for (int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
		}
		int first = numbers [0];
		System.out.println("First number is " + first);
		int maxnumber = numbers[0];
			for(int i = 0; i < numbers.length; i++){
				if(numbers[i] > maxnumber){
					maxnumber = numbers[i];
				}
			}
		System.out.println("Maxnumber is " + maxnumber);
		int[] newnumbers = numbers;
		int newfirst = newnumbers[0];
		maxnumber = newnumbers[i];
		newfirst = maxnumber;
		System.out.println(Arrays.toString(newnumbers));
		scanner.close();
}

