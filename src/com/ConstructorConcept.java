package com;

public class ConstructorConcept {
	int x;

	public ConstructorConcept(){
		
	}
	public ConstructorConcept(int y) {
	x = y;
}
	
	String name;
	int id;
	public ConstructorConcept(String empName, int empId){
		name = empName;
		id= empId;
	}
	
	public void getEmpDetails(){
		System.out.println("Name: " + name);
		System.out.println("Id: " + id);
	}

	public static void main(String[] args) {
		ConstructorConcept n = new ConstructorConcept(3);
		System.out.println(n.x);
		ConstructorConcept n1 = new ConstructorConcept("Sheetal", 10040);
		n1.getEmpDetails();
		ConstructorConcept n2 = new ConstructorConcept();
		n2.x = 6;
		System.out.println(n2.x);
	}

}
