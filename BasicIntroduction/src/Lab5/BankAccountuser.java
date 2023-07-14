package Lab5;

public class BankAccountuser {

	public static void main(String[] args) {
		
		BankAccount ba1=new BankAccount("Hari" , 100000,987654321);
		BankAccount ba2=new BankAccount("Sudharasanan" , 250000,98989898);
		BankAccount ba3=new BankAccount("Shakthivel" , 230000 , 987879779);
		BankAccount ba4=new BankAccount("Gopi" , 45000000 , 98756787);
		BankAccount ba5=new BankAccount("Sharan" , 340000, 878787878);
		
		System.out.println(ba1);
		System.out.println(ba2);
		System.out.println(ba3);
		System.out.println(ba4);
		System.out.println(ba5);

		ba1.setBalance(100000);
		System.out.println(ba1.getCustomername() + " - " + ba1.getBalance());
		
		System.out.println(ba3.getCustomername() + " - " +  ba3.getAccountnumber());
		
		System.out.println(ba4.getCustomername()+ " - " + ba4.getAccountnumber());
		
		
	}
}
