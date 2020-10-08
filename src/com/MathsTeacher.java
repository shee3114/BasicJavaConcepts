package com;

// Inheritance Concept
class Teacher {

	String designation = "Teacher";
	String collegeName = "Swami Vivekanand";

	public void doTeaching() {
		System.out.println("Teaching...");
	}
}

public class MathsTeacher extends Teacher {

	String subject = "Maths";

	public static void main(String[] args) {
		MathsTeacher obj = new MathsTeacher();
		System.out.println(obj.designation);
		System.out.println(obj.collegeName);
		System.out.println(obj.subject);
		obj.doTeaching();
	}

}
