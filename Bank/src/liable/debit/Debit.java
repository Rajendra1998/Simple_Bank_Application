package liable.debit;
import java.util.*;
public class Debit 
{
	public int debit;
	public int showDebit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter how much you want to deposit to your account ?");
		debit=sc.nextInt();
		return debit;
	}
}
