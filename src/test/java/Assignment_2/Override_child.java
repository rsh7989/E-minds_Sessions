package Assignment_2;

public class Override_child extends Override_parent {

	public void add(int a, int b) {
		int sum = a + b;
		System.out.println("Add method of child class: " + sum);
	}

	public static void main(String[] args) {
		Override_parent a = new Override_child();
		Override_parent a1 = new Override_parent();
		a.add(5, 6);
		a1.add(7, 8);
	}
}
