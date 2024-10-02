package AssInheritance;

public class Employee extends Person{
public void Work()
{
	super.work();
	System.out.println("It is Employee class work");
}
public void getSalary()
{
	System.out.println("Employee get his/her salary");
}
}