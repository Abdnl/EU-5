package LiveReviewWithMuhtar01_27_03_2021;

public class EmployeeInfo {

	public static void main(String[] args) {
		
		String name = "Abdurrahman";
		String companyName = "Google";
		String jobTitle = "SDET";
		char gender = 'M' ;
		double salary = 100000;
		int employeeID = 02021;
		//boolean hasBenefits= false;
		boolean ismarried = true;
		
		System.out.println("Employee name is: " + name + " - Working at "+ companyName+" as an " + jobTitle);
		
		System.out.println("*********************************************************");
		
		System.out.println("Employee name is: " + name);
		
		System.out.println("Employee gender is: " + gender);
		
		System.out.println("Company name is: " + companyName);
		
		System.out.println("Employee ID is: "+employeeID);
		
		System.out.println("Job title is: " + jobTitle);
		
		System.out.println(name+" wants to be an " + jobTitle + " in a well known company");
		
		System.out.println(name + " wants to make "+ (int)salary + " $"+ " a year");
		//salary was double but we changed it to int.
		
		System.out.println("Employee is married: " + ismarried );
		
		

	}

}
/*
Task01. create a class called EmployeeInfo:
 1. declare the following variables: name, gender, isMarried, hasBenefits, companyName, 
 	employeeId, jobTitle, salary 
 2. print:
       your company's name
       your Name
       your employee Id
       your job title
       your salary
*/