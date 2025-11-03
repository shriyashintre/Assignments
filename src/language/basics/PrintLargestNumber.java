package language.basics;

public class PrintLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 12, 34, 11, 36, 87, 98, 93 };

		// Storing top 3 largest numbers
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		int third = Integer.MIN_VALUE;

		for (int i = 0; i < arr.length; i++) {
			int num = arr[i];

			// Check if current number is greater than the largest
			if (num > first) {
				third = second; // move previous second to third
				second = first; // move previous first to second
				first = num; // assign new largest
			}

			// If not largest, check if it's second largest
			else if (num > second) {
				third = second; // move previous second to third
				second = num; // assign new second largest
			}

			// If not first or second, check if it's third largest
			else if (num > third) {
				third = num; // assign new third largest
			}

		}

		System.out.println("Second largest number: " + second);
		System.out.println("Third largest number: " + third);
	}

}
