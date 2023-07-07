package Assignment4collections;

public class Employee {

	private String Ename;
	private int age;
	private String designation;
	private double salary;
	private int id;

	String getEname() {
		return Ename;
	}

	public void setEname(String ename) {
		Ename = ename;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Employee(String ename, int aage, String designation, double salary, int id) {
		super();
		this.Ename = ename;
		this.age = aage;
		this.designation = designation;
		this.salary = salary;
		this.id = id;
	}

	@Override
	public String toString() {

		return "Ename=" + Ename + ", age=" + age + ", designation=" + designation + ", salary=" + salary + ", id=" + id;
	}

}
