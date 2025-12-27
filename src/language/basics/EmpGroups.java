package language.basics;

public class EmpGroups {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Employees emp = new Employees(); 
		
		String[] employeeNames = new String[3];
		employeeNames[0] = emp.empName1;
		employeeNames[1] = emp.empName2;
		employeeNames[2] = emp.empName3;
		
		int[] empIds = new int[3];
		empIds[0] = emp.empId1;
		empIds[1] = emp.empId2;
		empIds[2] = emp.empId3;
		
		//printing the names along with their id's
		System.out.println(employeeNames[0] + ":" + empIds[0]);
		System.out.println(employeeNames[1] + ":" + empIds[1]);
		System.out.println(employeeNames[2] + ":" + empIds[2]);
		
		
	}

}
