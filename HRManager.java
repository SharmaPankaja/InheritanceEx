package AssInheritance;

public class HRManager extends Employee {
	public void work() {
		super.work();
		System.out.println("It is HRManager Class Work");
	}

	public void addEmployee() {
		System.out.println("Employee Sucessfully  Added");
	}
}