package week1.day4;

public class StringReverse {

	public static void main(String[] args) {
		String name = "Sreeshma";
		char[] charArray = name.toCharArray();
		for (int i=charArray.length -1;i>=0;i--) 
		{
			System.out.println(charArray[i]);
		}

	}

}
