package lv.sonya.practice;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Encryptor {

	static String text;
	String[] temporary;

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		text = scanner.nextLine();
		Encryptor encryptor = new Encryptor();
		System.out.println(encryptor.encrypt(text));
		String textForDecoding = scanner.nextLine();
		System.out.println(encryptor.decode(textForDecoding));
	}

	public ArrayList<String> encrypt(String input) {
		String reversedText = new StringBuilder(input).reverse().toString();
		temporary = reversedText.split("");
		ArrayList<String> encryptedText = new ArrayList<String>();
		for (String letter : temporary) {
			encryptedText.add(letter);
			if (letter.equals("a")) {
				encryptedText.add("8");
				encryptedText.remove("a");
			}
			if (letter.equals("s")) {
				encryptedText.add("3");
				encryptedText.remove("s");
			}
		}
		return encryptedText;
	}

	public ArrayList<String> decode(String input) {
		ArrayList<String> decodedText = new ArrayList<>();
		temporary = input.split("");
		for( String letter : temporary){
			decodedText.add(letter);
			if(letter.equals("8")){
				decodedText.add("a");
				decodedText.remove("8");
			}
			if(letter.equals("3")){
				decodedText.add("s");
				decodedText.remove("3");
			}
		} return decodedText;
	}
}
