package BasicIntroduction;

public class Employee extends Person {

	private int employeeid;
	private double salary;

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public int getAge() {
		// TODO Auto-generated method stub
		return super.getAge();
	}

	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();

	}

	@Override
	public String toString() {
		return "Employee [employeeid=" + employeeid + ", salary=" + salary + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public Employee(int i, double d) {
		this.employeeid = i;
		this.salary = d;
	}

}
