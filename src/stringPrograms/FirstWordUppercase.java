package stringPrograms;

public class FirstWordUppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Java Programming is fun and challenging";

		// Print original sentence
		System.out.println("Original Sentence: " + sentence);

		// Split the sentence into words
		String[] words = sentence.split(" ");

		String result = "";

		for (String word : words) {
			// Convert first character to uppercase and rest to lowercase
			String capitalized = word.substring(0, 1).toUpperCase() + word.substring(1);
			result += capitalized + " ";

		}

		System.out.println("Capitalized Sentence: " + result.trim());
	}
}
