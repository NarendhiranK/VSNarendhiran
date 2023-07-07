package Assignment4collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employeedetails {

	static Scanner s = new Scanner(System.in);

	public Employee detailsofEmployee(List<Employee> ls) {

		for (Employee employee : ls) {

			System.out.println(employee);
		}

		return null;
	}

	public Employee searchemployee(List<Employee> ls, int iid) {

		for (Employee employee : ls) {
			if (employee.getId() == iid) {
				return employee;
			}
		}

		return null;

	}

	public List<Employee> Employeeupdation(List<Employee> ls, int iid) {

		for (Employee employee : ls) {

			if (employee.getId() == iid) {

				System.out.println("Enter the new details of the employee");
				System.out.println("1.tochange name \n2.tochange age \n3.tochange designation \n4.tochange salary \n5.tochange id \n6.tochange all details");
				int input = s.nextInt();
				switch (input) {
				case 1: {
					System.out.println("The old name is" + employee.getEname());
					System.out.println("Enter the new name");
					employee.setEname(s.next());
					System.out.println("The new name is" + employee.getEname());
					System.out.println(employee);
				}
					break;
				case 2: {
					System.out.println("The old age is" + employee.getAge());
					System.out.println("Enter the new age");
					employee.setAge(s.nextInt());
					System.out.println("The new age is" + employee.getAge());
					System.out.println(employee);
				}
					break;
				case 3: {
					System.out.println("The old designation is" + employee.getDesignation());
					System.out.println("Enter the new designation");
					employee.setDesignation(s.next());
					System.out.println("The new designation is" + employee.getDesignation());
					System.out.println(employee);
				}
					break;
				case 4: {
					System.out.println("The old salary is" + employee.getSalary());
					System.out.println("Enter the new salary");
					employee.setSalary(s.nextDouble());
					System.out.println("The new salary is" + employee.getSalary());
					System.out.println(employee);
				}
					break;
				case 5: {
					System.out.println("The old id is" + employee.getId());
					System.out.println("Enter the new id");
					employee.setId(s.nextInt());
					System.out.println("The new id is" + employee.getId());
					System.out.println(employee);
				}
					break;
				case 6: {
					System.out.println("The old name is" + employee.getEname());
					System.out.println("Enter the new name");
					employee.setEname(s.next());
					System.out.println(employee);
					System.out.println("The new name is" + employee.getEname());
					System.out.println("The old age is" + employee.getAge());
					System.out.println("Enter the new age");
					employee.setAge(s.nextInt());

					System.out.println("The new age is" + employee.getAge());
					System.out.println(employee);
					System.out.println("The old designation is" + employee.getDesignation());
					System.out.println("Enter the new designation");
					employee.setDesignation(s.next());

					System.out.println("The new designation is" + employee.getDesignation());
					System.out.println(employee);
					System.out.println("The old salary is" + employee.getSalary());
					System.out.println("Enter the new salary");
					employee.setSalary(s.nextDouble());
					System.out.println("The new salary is" + employee.getSalary());
					System.out.println(employee);
					System.out.println("The old id is" + employee.getId());
					System.out.println("Enter the new id");
					employee.setId(s.nextInt());
					System.out.println("The new id is" + employee.getId());
					System.out.println(employee);

				}

				}
				break;

			} else {
				System.out.println("Please enter the proper id");
			}
		}
		return ls;

	}

	public List<Employee> deleteemployee(List<Employee> ls, int iid) {

		for (Employee employee : ls) {
			if (employee.getId() == iid) {

				ls.remove(iid);
				return ls;

			}

		}
		return null;
	}
}
