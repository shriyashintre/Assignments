package stringPrograms;

public class StarsPattern {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int rows = 5;  // You can change this value

        for (int i = 1; i <= rows; i++) 
        {
            // Printing for the spaces 
            for (int j = i; j < rows; j++) 
            {
                System.out.print(" ");
            }
            //  print for the stars
            for (int k = 1; k <= i; k++) 
            {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
}

	


