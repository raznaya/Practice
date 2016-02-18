package lv.sonya.practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Encryptor {
	
	static String text;

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		text = scanner.nextLine();
		Encryptor encryptor = new Encryptor();
		encryptor.encrypt(text);

	}
	
	public void encrypt(String input){
		String reversedText = new StringBuilder(input).reverse().toString();
		System.out.println(reversedText);
		String[] temporary = reversedText.split("");
		for(int i : temporary[]){
			
		}
	}

}
