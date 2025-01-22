package week1.day3;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		int[] num={1,4,3,2,8,6,7};
		Arrays.sort(num);
		System.out.println("Sorted Array: " + Arrays.toString(num));
		for (int i = 0; i < num.length; i++) {
			
			if(num[i]!= i+1) {
			int missingelement = i+1;
				
			System.out.println("The missing element is: " + missingelement);
			break;
			}
		}

	}

}
