package language.basics;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionsPractice {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//storing student details data
		Map<String, String> StudentDetails1 = new HashMap<String, String>();
		StudentDetails1.put("Name", "Jhon Doe");
		StudentDetails1.put("Age", "20");
		StudentDetails1.put("Gender", "Male");
		StudentDetails1.put("Roll Number", "S12345");
		StudentDetails1.put("Grade", "A");
		StudentDetails1.put("Major", "computer Science");
		StudentDetails1.put("GPA", "A38");
		StudentDetails1.put("Email", "john@example.com");
		StudentDetails1.put("Contact Number", "9999997777");
		StudentDetails1.put("Contact Number", "9999997777");
		StudentDetails1.put("Address", "123 Elm St");
		System.out.println( StudentDetails1);
		
		Map<String, String> StudentDetails2 = new HashMap<String, String>();
		StudentDetails2.put("Name", "Jane Smit");
		StudentDetails2.put("Age", "21");
		StudentDetails2.put("Gender", "Female");
		StudentDetails2.put("Roll Number", "S12346");
		StudentDetails2.put("Grade", "B");
		StudentDetails2.put("Major", "Mathematics");
		StudentDetails2.put("GPA", "3.5");
		StudentDetails2.put("Email", "jane@example.com");
		StudentDetails2.put("Contact Number", "9876665666");
		StudentDetails2.put("Address", "456 Oak St");
		System.out.println(StudentDetails2);
		
		Map<String, String> StudentDetails3 = new HashMap<String, String>();
		StudentDetails3.put("Name", "Mike Brown");
		StudentDetails3.put("Age", "22");
		StudentDetails3.put("Gender", "Male");
		StudentDetails3.put("Roll Number", "S12347");
		StudentDetails3.put("Grade", "A");
		StudentDetails3.put("Major", "Physics");
		StudentDetails3.put("GPA", "3.9");
		StudentDetails3.put("Email", "mike@example.com");
		StudentDetails3.put("Contact Number", "8787876546");
		StudentDetails3.put("Address", "789 Pine St");
		System.out.println(StudentDetails3);
		
		//storing all the 3 student details in arraylist
		List<Map<String, String>> studentDetailsList = new ArrayList<Map<String, String>>();
		studentDetailsList.add(StudentDetails1);
		studentDetailsList.add(StudentDetails2);
		studentDetailsList.add(StudentDetails3);
		System.out.println(studentDetailsList);
		
	      //storing employee details data
		Map<String, String> EmployeeDetails1 = new HashMap<String, String>();
		EmployeeDetails1.put("Employee ID", "E001");
		EmployeeDetails1.put("Name", "Alice Green");
		EmployeeDetails1.put("Age", "30");
		EmployeeDetails1.put("Gender", "Female");
		EmployeeDetails1.put("Department", "Engineering");
		EmployeeDetails1.put("Position", "Software Engineer");
		EmployeeDetails1.put("Salary", "75,000");
		EmployeeDetails1.put("Email", "alice@example.com");
		EmployeeDetails1.put("Contact Number", "9876543213");
		System.out.println(EmployeeDetails1);
		
		Map<String, String> EmployeeDetails2 = new HashMap<String, String>();
		EmployeeDetails2.put("Employee ID", "E002");
		EmployeeDetails2.put("Name", "Bob Johnson");
		EmployeeDetails2.put("Age", "35");
		EmployeeDetails2.put("Gender", "Male");
		EmployeeDetails2.put("Department", "Marketing");
		EmployeeDetails2.put("Position", "Marketing Manager");
		EmployeeDetails2.put("Salary", "85,000");
		EmployeeDetails2.put("Email", "bob@example.com");
		EmployeeDetails2.put("Contact Number", "9876543214");
		System.out.println(EmployeeDetails2);
		
		Map<String, String> EmployeeDetails3 = new HashMap<String, String>();
		EmployeeDetails3.put("Employee ID", "E003");
		EmployeeDetails3.put("Name", "Carol White");
		EmployeeDetails3.put("Age", "28");
		EmployeeDetails3.put("Gender", "Female");
		EmployeeDetails3.put("Department", "Sales");
		EmployeeDetails3.put("Position", "Sales Executive");
		EmployeeDetails3.put("Salary", "65,000");
		EmployeeDetails3.put("Email", "carol@example.com");
		EmployeeDetails3.put("Contact Number", "9876543215");
		System.out.println(EmployeeDetails3);

		//storing all 3 employee details in arraylist
		List<Map<String, String>> employeeDetailsList = new ArrayList<Map<String, String>>();
		employeeDetailsList.add(EmployeeDetails1);
		employeeDetailsList.add(EmployeeDetails2);
		employeeDetailsList.add(EmployeeDetails3);
		System.out.println(employeeDetailsList);
		
		//storing product details
		Map<String, String> ProductDetails1 = new HashMap<String, String>();
		ProductDetails1.put("Product ID", "P001");
		ProductDetails1.put("Name", "Laptop");
		ProductDetails1.put("Category", "Electronics");
		ProductDetails1.put("Price", "$1,200");
		ProductDetails1.put("Stock Quantity", "50");
		ProductDetails1.put("Supplier", "Tech Supplies");
		ProductDetails1.put("Warranty", "2 years");
		ProductDetails1.put("Rating", "4.5");
		ProductDetails1.put("Manufacturing Date", "15-01-2023");
		ProductDetails1.put("Expiry Date", "15-01-2025");
		System.out.println(ProductDetails1);
		
		Map<String, String> ProductDetails2 = new HashMap<String, String>();
		ProductDetails2.put("Product ID", "P002");
		ProductDetails2.put("Name", "Desk Chair");
		ProductDetails2.put("Category", "Furniture");
		ProductDetails2.put("Price", "$150");
		ProductDetails2.put("Stock Quantity", "200");
		ProductDetails2.put("Supplier", "Office Depot");
		ProductDetails2.put("Warranty", "1 year");
		ProductDetails2.put("Rating", "4");
		ProductDetails2.put("Manufacturing Date", "10-02-2023");
		ProductDetails2.put("Expiry Date", "N/A");
		System.out.println(ProductDetails2);
		
		Map<String, String> ProductDetails3 = new HashMap<String, String>();
		ProductDetails3.put("Product ID", "P003");
		ProductDetails3.put("Name", "Coffee Maker");
		ProductDetails3.put("Category", "Kitchen");
		ProductDetails3.put("Price", "$75");
		ProductDetails3.put("Stock Quantity", "100");
		ProductDetails3.put("Supplier", "KitchenWorld");
		ProductDetails3.put("Warranty", "6 months");
		ProductDetails3.put("Rating", "4.2");
		ProductDetails3.put("Manufacturing Date", "20-03-2023");
		ProductDetails3.put("Expiry Date", "20-03-2024");
		System.out.println(ProductDetails3);
		
		//storing all 3 product details in arraylist
		List<Map<String, String>> productDetailsList = new ArrayList<Map<String, String>>();
		productDetailsList.add(ProductDetails1);
		productDetailsList.add(ProductDetails2);
		productDetailsList.add(ProductDetails3);
		System.out.println(productDetailsList);
		
		Map<String, List<Map<String, String>>> data = new HashMap<String, List<Map<String, String>>>();
		data.put("ProductData", productDetailsList);
		System.out.println("get Supplier Name from 2nd row : "+ data.get("ProductData").get(1).get("Supplier"));
		
	}

}
