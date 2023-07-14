package BasicIntroduction;

public class Employees {

	public static void main(String[] args) {

		Employee e1 = new Employee(123, 15000.0);

		Employee e2 = new Employee(124, 16500.0);

		System.out.println(e1.getEmployeeid());
		System.out.println(e1.getSalary());

		System.out.println(e2.getEmployeeid());
		System.out.println(e2.getSalary());

	}

}
