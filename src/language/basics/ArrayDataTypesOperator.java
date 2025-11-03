package language.basics;

public class ArrayDataTypesOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create a array to store Student names
		String[] studentNames = { "suresh", "Mahesh", "Naresh" };

		// Create a array to store student marks
		int[] studentMarks = { 75, 80, 82 };

		// Create another array to store student marks after adding into 10
		int[] studentUpdatedMarks = new int[studentMarks.length];

		// adding 10 marks into original student marks
		for (int i = 0; i < studentMarks.length; i++) {
			studentUpdatedMarks[i] = studentMarks[i];
			studentUpdatedMarks[i] += 10;

		}
		System.out.println("Updated Marks");
		for (int i = 0; i < studentNames.length; i++) {

			System.out.println(studentNames[i] + "\t" + studentUpdatedMarks[i]);

		}

		// storing total of all student marks
		int sum = 0;
		for (int i = 0; i < studentUpdatedMarks.length; i++) {
			sum += studentUpdatedMarks[i]; // adding all updated marks
		}
		double allStudentAverage = sum / studentUpdatedMarks.length;
		System.out.println("Average marks of all student : " + allStudentAverage);
	}
}
