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
		char second = reversedText.charAt(1);
		char fourth = reversedText.charAt(3);
		char seventh = reversedText.charAt(6);
		char eighth = reversedText.charAt(7);
		char[] charArray = new char[]{second, fourth, seventh, eighth};
		String chars = charArray.toString();
		String reversedChars = new StringBuilder(chars).reverse().toString();
		String[] newCharArray = reversedChars.split("");
	}

}
