package liable;
import java.util.*;
public class Responsibility 
{
	public static long accountno;
	public static String name;
	public void input() throws InterruptedException
	{
		System.out.println("\t\t\t\t\t\t\t****            SIMPLE_BANK_APP            ****\n\n");
		System.out.println("**Person who enters below requirements is responsible for the balance variation in the account.");
		System.out.println("** MINIMUM ACCOUNT BALANCE SHOULD BE 3000.\n");
		Thread.sleep(6000);//Pause for 6 seconds.
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter account holder name :");
		name=sc.nextLine();
		System.out.println("Enter Account number:");
		accountno=sc.nextLong();
		
	}
	public void show()
	{
		System.out.println("\nWELCOME "+name+" , YOUR ACCOUNT NUMBER IS "+accountno+" .");
	}
}
