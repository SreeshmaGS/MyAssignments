package week1.day4;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text1 = "We learn Java basics as part of java sessions in java week1";
		//System.out.println(text1);
		int count = 0;
		String[] words = text1.split(" ");
		for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
            	if (words[i].equalsIgnoreCase(words[j])) {
                    words[j] = "";
                    count++; 

	}
            	
            }
		}


		if (count > 0) {
			System.out.println("Duplicates were found and replaced. Modified array: ");
			for (String word : words) {
				System.out.print(word + " ");
			}
			System.out.println();
		} else {
			System.out.println("No duplicates found.");
		}

		System.out.println("Total number of duplicates replaced: " + count);
	}
}
