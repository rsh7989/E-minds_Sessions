package Assignment_2;

public class Employee extends Person {
	private String employeeId;

	public Employee(String name, int age, String employeeId) {
		super(name, age);
		this.employeeId = employeeId;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void display() {
		super.display();
		System.out.println("Employee ID: " + employeeId);
	}

	public static void main(String[] args) {

		Student student = new Student("Alice", 20, "R12345");

		Employee employee = new Employee("Bob", 30, "A54321");

		System.out.println("Student Details:");
		student.display();

		System.out.println("\nEmployee Details:");
		employee.display();
	}
}
