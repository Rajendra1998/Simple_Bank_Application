package asset.credit;
import java.util.*;
public class Credit 
{
	public int credit;
	public int showCredit()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\nEnter how much you want to withdraw from ur account ? ");
		credit=sc.nextInt();
		return credit;
	}
}
