package ExceptionHandlingprogram;

public class Exceptionprogram1 {

	public static void main(String[] args) {

		exceptionmethod();

	}

	public static void exceptionmethod() {

		try {

			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			try
			{
				throw new ArrayIndexOutOfBoundsException();
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("ArrayIndexOutofBounds of exception is handled");
				try
				{
					throw new StringIndexOutOfBoundsException();
					
				}
				catch(ArithmeticException z)
				{
					System.out.println("ArithmeticException");
				}
				catch(IllegalArgumentException g)
				{
					System.out.println("IllegalArgumentException");
				}
				catch(StringIndexOutOfBoundsException h)
				{
					System.out.println("StringIndexOUtofBoundsException");
				}
			}
			System.out.println(5 / 0);
			System.out.println(6);
			System.out.println(7);
			System.out.println(8);
		} catch (ArithmeticException e) {

			System.out.println("Exceptionsis handleld");
		} catch (IndexOutOfBoundsException f) {
			System.out.println("Hi");
		} catch (Exception g) {
			System.out.println("Bye");
		}
	}
}
