package StringHandling;

public class Stringprogram1 {

	public static void main(String[] args) {

		String s1 = "Priyadharshni";
		String s = new String("Hello world we are the java devolopers - vastpro");

		int a = s.length();
		System.out.println(a);

		String s2 = s1 + s;

		String s3 = s.substring(2);
		System.out.println(s3);
		String s4 = s.substring(2, 4);
		System.out.println(s4);

		String s5 = s.toUpperCase();
		System.out.println(s5);

		String s6 = s.toLowerCase();
		System.out.println(s6);

		String s7 = s.replace('l', 'i');
		System.out.println(s7);

		String s8 = "AHello";
		String s9 = "Ava devolopers";

		System.out.println(s8 == s9);

		System.out.println(s8.equals(s9));

		System.out.println(s8.compareTo(s9));

	}
}
