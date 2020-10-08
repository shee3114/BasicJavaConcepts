package com;

public class VariableConcept {

	// --------- start of the static variable
	static int rollNo; // this is static variable

	final static String location = "Navi Mumbai";

	// --- end of the static variable.

	// ---------start of instance variable-------
	String name; // this is instance variable

	private double salary; // This is instnance variable
	int empId;
	// assign variable using Constructor
	public VariableConcept(String empName) {
		name = empName;
	}

	
	// Method to set the salary
	public void setSalary(double empSalary) {
		salary = empSalary;
	}

	// Method to print emp details
	public void printEmpDetails() {
		System.out.println("This is Instance variable");
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}

	// ------------------------------end of the instance variable concept
	// ------------------ start of local variable
	public void printAge() {
		int age = 0; // This is local variable.
		age = age + 7;
		System.out.println("\nThis is Local variable");
		System.out.println("Age is: " + age);
		int c;
	
	}
	// ---------------------- end of the Local variable

	// ---------------Start of the static variable

	public static void main(String[] args) {
		VariableConcept obj = new VariableConcept("Sheetal");
		obj.setSalary(60000);
		obj.printEmpDetails();
		obj.printAge();
		rollNo = 14;
		System.out.println("\nthis is static variable");
		System.out.println(VariableConcept.rollNo);
		System.out.println(VariableConcept.location);
		System.out.println(Fibonacci.lastName);
	}
}
