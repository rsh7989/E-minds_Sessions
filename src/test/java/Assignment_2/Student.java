package Assignment_2;

public class Student extends Person {
	private String studentId;

	public Student(String name, int age, String studentId) {
		super(name, age);
		this.studentId = studentId;
	}

	public String getStudentId() {
		return studentId;
	}

	public void display() {
		super.display();
		System.out.println("Student ID: " + studentId);
	}

}
