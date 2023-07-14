package BasicIntroduction;

import java.util.ArrayList;

public class Persons {

	public static void main(String[] args) {

		Person p1 = new Person();
		Person p2 = new Person();

		p1.setAddress("No 7 Vadapalani");
		p1.setAge(25);
		p1.setName("Vijay");

		System.out.println(
				"Name - " + p1.getName() + " " + "Age - " + p1.getAge() + " " + "Address - " + p1.getAddress());

		p2.setAddress("No 10 Ekaattuthangal");
		p2.setName("Ganesh");
		p2.setAge(27);

		System.out.println(
				"Name - " + p2.getName() + " " + "Age - " + p2.getAge() + " " + "Address - " + p2.getAddress());

		// LAB-2

		Person p3 = new Person("Ajithkumar", 40, "Guindy");
		Person p4 = new Person("Dhanush", 40, "Ashok Pillar");
		Person p5 = new Person("Priya", 22, "Ambattur");

		System.out.println(p3);
		System.out.println(p4);
		System.out.println(p5);

		System.out.println(Person.count);

	}

	@Override
	public String toString() {
		return "Persons [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
