package stringPrograms;

public class ReverseWords {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       String sentence = "Java Programming is fun and challenging";
		
		//Split the sentence into words using space seperator
		String[] words = sentence.split(" ");
		
		// Printing words in reverse order
        System.out.print("Reversed sentence: ");
        for (int i = words.length - 1; i >= 0; i--) 
        {
            System.out.print(words[i] + " ");

	}
	
	}
}
