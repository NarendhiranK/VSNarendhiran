package BasicIntroduction;

public class Person {

	public static int count;

	private String name;
	private int age;
	private String address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Person(String name, int age, String address) {

		super();
		this.name = name;
		this.age = age;
		this.address = address;
		count++;
	}

	public Person() {

		count++;
	}

	public void detailsoftheperson() {
		System.out.println("The Name of the person is :" + name);
		System.out.println("THe age of the person is : " + age);
		System.out.println("THe Address of the person is : " + address);

	}

}
