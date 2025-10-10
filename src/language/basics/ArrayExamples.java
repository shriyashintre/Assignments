package language.basics;

public class ArrayExamples {

	public static void main(String[] args) 
	{
	// TODO Auto-generated method stub
		//creating 3D array
		//Semester as the first dimension (semister = 5, array index(0 to 4))
		//subject and status marks as second dimension (subjects = 6, array index(0 to 5))
		//actual values for the subject names and marks (Subject names = 6, marks/values = 6)
		
		String[][][] multidimensional = {
				{//sem 1
					{"Mathematics I", "Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."},
				    {"Pass(78)", "Pass(85)", "Fail(21)", "Pass(74)", "Pass(88)", "Pass(79)"}
		        },
				{//sem 2
		        	{"Mathematics II", "Mechanics", "Environmental Sci.", "Basic Electronics", "Engineering Physics", "Engineering Graphics"},
		        	{"Pass(82)", "Pass(77)", "Pass(93)", "Fail(19)", "Fail(24)", "Pass(90)"}
				},
				{//sem 3
					{"Data Structures", "Discrete Mathematics", "Digital Electronics", "Operating Systems", "Signals and Systems", "Object-Oriented Prog."},
					{"Pass(88)", "Pass(81)", "Pass(76)", "Fail(32)", "Pass(85)", "Pass(78)"}
				},
				{//sem 4
					{"Algorithms", "Computer Networks", "Database Systems", "Microprocessors", "Communication Eng.", "Software Engineering"},
					{"Pass(91)", "Pass(73)", "Fail(19)", "Pass(80)", "Pass(76)", "Pass(87)"}
				},
				{//sem 5
					{"Probability & Stats", "Machine Learning", "Compiler Design", "Theory of Computation", "Embedded Systems", "Computer Graphics"},
					{"Pass(86)", "Pass(88)", "Pass(84)", "Pass(95)", "Pass(73)", "Pass(90)"}
				}
		};
		// Print Semester 3 Subject 4 and Subject 5 names
		System.out.println("semester 3 , subject 4 : " + multidimensional[2][0][3]);
		System.out.println("semester 3 , subject 5 : " + multidimensional[2][0][4]);
		
		// Print marks of Semester 5, Subject 3 and Subject 6
		System.out.println("semester 5 , subject 3 : " + multidimensional[4][1][2]);
		System.out.println("semester 5 , subject 6 : " + multidimensional[4][1][5]);
	}
}
