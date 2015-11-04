package lv.sonya.practice;

import java.util.Arrays;
import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		int[] numbers = new int[5];
		Scanner scanner = new Scanner(System.in);

		System.out.println("Input 5 numbers!");
		for (int i = 0; i < 5; i++) {
			numbers[i] = scanner.nextInt();
		}
		int first = numbers[0];
		System.out.println("First number is " + first);

		int max = numbers[0];
		int maxIndex = 0;
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max) {
				max = numbers[i];
				maxIndex = i;
			}
		}
		System.out.println("Max number is " + max);
		System.out.println("Index is " + maxIndex);

		int temp = numbers[maxIndex];
		numbers[maxIndex] = numbers[0];
		numbers[0] = temp;
		System.out.println(Arrays.toString(numbers));
		scanner.close();
	}

}
