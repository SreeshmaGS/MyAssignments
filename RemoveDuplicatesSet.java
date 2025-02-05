package week3.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesSet {

	public static void main(String[] args) {
		
		String companyName = "google";
		char[] charArray = companyName.toCharArray();
		Set<Character> uniqueChars = new LinkedHashSet<>();
		for (int i=0;i<charArray.length;i++){
			uniqueChars.add(charArray[i]);
		}
		
System.out.println("The unique set is : " +uniqueChars);
	}

}
