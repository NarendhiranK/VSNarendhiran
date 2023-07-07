package Assignment4collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employeemain {
	static boolean b = false;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		List<Employee> ls = new ArrayList<Employee>();
		Employeedetails ed = new Employeedetails();
		Employee e1 = new Employee("Narendhiran", 22, "Software Devoloper", 123456.0, 5);
		Employee e2 = new Employee("Prashanth", 25, "SOFTWARE DEVOLOPER", 654321.097, 1);
		Employee e3 = new Employee("Guru", 22, "SOFTWARE DEVOLOPER", 135790.0, 2);
		Employee e4 = new Employee("Kamesh", 24, "SOFTWARE DEVOLOPER", 246808.0, 3);
		Employee e5 = new Employee("Ganesh", 23, "SOFTWARE DEVOLOPER", 132465.0, 4);
		ls.add(e1);
		ls.add(e2);
		ls.add(e3);
		ls.add(e4);
		ls.add(e5);

		System.out.println(
				"1.Details of the Employee \n2.Search for an employee \n3.Update the details of the employee \n4.Delete the employee");
		int input = s.nextInt();
		switch (input) {
		case 1: {

			ed.detailsofEmployee(ls);
		}
			break;
		case 2: {
			System.out.println("Enter the id to search for an employee");
			int iid = s.nextInt();

			Employee result = ed.searchemployee(ls, iid);
			if (result != null) {

				System.out.println("The employee name is :" + result.getEname());
				System.out.println("The employee age is :" + result.getId());
				System.out.println("The employee designation is :" + result.getDesignation());
				System.out.println("The employee salary is : " + result.getSalary());
				System.out.println("The employee id is :" + result.getId());

			} else {
				System.out.println("There is no such employee");
			}
		}
			break;
		case 3: {
			System.out.println("Enter the id of the employee to update");
			int iid = s.nextInt();
			ed.Employeeupdation(ls, iid);
		}
			break;
		case 4: {
			System.out.println("Enter the id of the employee to delete");
			int iid = s.nextInt();
			List<Employee> result=ed.deleteemployee(ls, iid);
			for (Employee employee : result) {
				System.out.println(employee);
			}
		}
			break;

		default: {
			System.out.println("Please enter the proper input");
		}
		}

	}
}