package AssInheritance;

public class Student {
	private String name;
	private int age;
	private String address;

	public Student() {
		name = "Unknown";
		age = 0;
		address = "Not Available";
	}

	public void setInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setInfo(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public void displayInfo() {
		System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
	}

	public static void main(String[] args) {
		Student[] students = new Student[10];
		for (int i = 0; i < students.length; i++) {
			students[i] = new Student();
		}

		students[0].setInfo("Pankaja", 24);
		students[1].setInfo("Pankaja", 24, "Nanded MH 431601");
		students[2].setInfo("Sharma", 19);
		students[3].setInfo("Hiteshree", 23, "456 Oak St");
		students[4].setInfo("Prajakta", 25);
		students[5].setInfo("Chetan", 25, "MH 26");
		students[6].setInfo("Kajal", 28);
		students[7].setInfo("Hitu", 20, "321 Birch St");
		students[8].setInfo("Praju", 24);
		students[9].setInfo("Jack", 22, "987 Cedar St");

		for (Student student : students) {
			student.displayInfo();
		}
	}
}