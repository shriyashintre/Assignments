package stringPrograms;

public class CountWords {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String sentence = "Java Programming is fun and challenging";
		
		//Split the sentence into words using space seperator
		String[] words = sentence.split(" ");
		
		//counting number of words
		int countWords = words.length;
		
		System.out.println("Total number of words count in the sentence : " + countWords);
		

	}

}
