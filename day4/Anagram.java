package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String text1 = "Hridhaan";
		String text2 = "Sanal";

		if (text1.length() == text2.length()) {

			System.out.println("Length of the strings are equal");

		}		
		else {

			System.out.println("Length of the strings are not equal");
		}

		char[] charArray1 = text1.toCharArray();
		char[] charArray2 = text2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		System.out.println("Sorted Array: " + Arrays.toString(charArray1) + " and " + Arrays.toString(charArray2));
		if (Arrays.equals(charArray1, charArray2))
		{
			System.out.println("The given strings are Anagram");
		}

		else
		{

			System.out.println("The given strings are not Anagram");
		}

	}
}

