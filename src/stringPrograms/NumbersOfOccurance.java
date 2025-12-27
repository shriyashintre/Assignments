package stringPrograms;

public class NumbersOfOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String paragraph = "Java is the popular programming language. Java is used for web devlopment, mobile applications and more.";

		String word = "Java";
		int count = 0;

		// Split the paragraph into words
		String[] Words = paragraph.split(" ");

		for (String wrd : Words) {
			wrd = wrd.replaceAll("[^a-zA-Z]", "");

			// Compare word
			if (wrd.equalsIgnoreCase(word)) {
				count++;
			}

		}
		System.out.println("Total occurance of '" + word + " ': " + count);
	}
}