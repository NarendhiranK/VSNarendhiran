package Lab8;

public class Wrapperclas {

	public static void main(String[] args) {

		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40;
		float e = 50;
		double f = 60;
		char g = 70;
		boolean h = true;

		//Object creation
		Byte a2 = Byte.valueOf(a);
		System.out.println(a2);

		Short b1 = Short.valueOf(b);

		Integer c1 = Integer.valueOf(c);
		
		Long d1 = Long.valueOf(d);

		Float e1 = Float.valueOf(e);

		Double f1 = Double.valueOf(f);

		Character g1 = Character.valueOf(g);

		Boolean h1 = Boolean.valueOf(h);
		
		//Auto-boxing
		Byte b3=a;
		Short s3=b;
		Integer i4=c;
		Long l5=d;
		Float f6=e;
		Double d7=f;
		Character c8=g;
		Boolean b9=h;
		
		
		//Auto-unboxing
		byte b4=b3;
		short s5=s3;
		int i5=i4;
		long l6=l5;
		float f7=f6;
		double d8=d7;
		char c9=c8;
		boolean b10=b9;

		System.out.println(a2);
		
		System.out.println(b1);

		System.out.println(c1);

		System.out.println(d1);

		System.out.println(e1);
		
		System.out.println(f1);
		
		System.out.println(g1);
		
		System.out.println(h1);

		Integer i=new Integer(a);
		
	}
}
