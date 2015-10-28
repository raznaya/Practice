package lv.sonya.practice;

import java.util.Scanner;

public class HumanGuess {

	public static void main(String[] args) {
		System.out.println("Program is thinking od numbers between 0 and 100.");
		int r = (int)(Math.random() * 100);
		Scanner scanner = new Scanner(System.in);
		int n;
		System.out.println("Input your number:");
		n = scanner.nextInt();
		while (true){
			if (n < r ){
			System.out.println("Enter larger number!");
			n = scanner.nextInt();
			}
			if (n > r){
				System.out.println("Enter smaller number!");
				n = scanner.nextInt();
			}
			if (n == r){
				System.out.println("You guessed! Congrats!");
				break;
			}
		}
		scanner.close();
}
}
// Vse rabotaet!
