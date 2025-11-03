package stringPrograms;

public class WordCountAndIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String Paragraph = "Java is a popular programming language. Java is used for web development, mobile applications, and more.";

		String word = "Java";
		// finding index of word
		int index = Paragraph.indexOf(word);
		while (index != -1) {
			System.out.println("Found '" + word + "' at index: " + index);
			// find next occurrence after current index
			index = Paragraph.indexOf(word, index + 1);

		}

	}
}
