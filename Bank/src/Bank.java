import asset.*;
import asset.credit.*;
import liable.*;
import liable.debit.*;
import java.util.*;

public class Bank {
	public static int balance;
	public static int credit;
	public static int code;
	public static int debit;
	public static int code2;
	public static int code1;
	public static int code3;
	public static int code4;
	
	public static void main(String[] args) throws InterruptedException
	{
		Scanner sc=new Scanner(System.in);
		Responsibility r =new Responsibility();
		Amount a=new Amount();
		Credit c=new Credit();
		Debit d=new Debit();
		balance=a.showAmount(3000); //minimum balance is 3000.
		r.input();
		r.show();
		while(true)
		{
			System.out.println("\nEnter the correct choice from below: \n\t 1 : BALANCE INQUIRY\n\t 2 : WITHDRAW\n\t 3 : DEPOSIT\n\t 4 : QUIT");
			System.out.println("Choose the correct code from above:");
			code=sc.nextInt();
			switch(code)
			{
			
			case 1:
				System.out.println("\nProcessing....Please wait....\n");
				Thread.sleep(2000);//Pause for 2 sec.
				System.out.println("\nYour account balance is "+balance+" . \n");
				break;
				
			case 2:
				System.out.println("\nAre you sure you want to WITHDRAW ?? \n\t Choose from below: \n\t\t 0 : NO\n\t\t 1 : YES");
				code1=sc.nextInt();
				if(code1==1)
				{
					credit=c.showCredit();
					//balance=balance-credit;
					if(balance<=3000) //minimum balance is 3000
					{
						System.out.println("\nProcessing....Please wait....\n");
						Thread.sleep(2000);//Pause for 2 sec.
						System.out.println("\nTRANSACTION FAILED !! ");
						System.out.println("Sorry !! You cannot withdraw the desired amount as the minimum account balance should be 3000.\n");
					}
					else
					{
						System.out.println("\nProcessing....Please wait....\n");
						balance=balance-credit;
						if(balance<3000) //after the 1st  transaction is over if i withdraw amount and rest balance is <3000
						{
							Thread.sleep(2000);//Pause for 2 sec.
							System.out.println("\nTRANSACTION FAILED !! ");
							System.out.println("Sorry !! You cannot withdraw the desired amount as the minimum account balance should be 3000.\n");
							balance=balance+credit;
						}
						else {
							Thread.sleep(2000);//Pause for 2 sec.
							System.out.println("\nTRANSACTION SUCCESSFUL !! ");
							System.out.println("You have successfully withdrawn "+credit+ " and Now Your Account balance  is "+balance+" . \n\n");
						}
						
					}
				}
				else {
					break;
				}
				break;
				
			 case 3:
				 System.out.println("\nAre you sure you want to DEPOSIT ?? \n\t Choose from below: \n\t\t 0 : NO\n\t\t 1 : YES");
					code2=sc.nextInt();
					if(code2==1)
					{
						debit=d.showDebit();
						System.out.println("\nProcessing....Please wait....\n");
						balance=balance+debit;
						Thread.sleep(2000);//Pause for 2 sec.
						System.out.println("\nTRANSACTION SUCCESSFUL !! ");
						System.out.println("You have successfully deposited "+debit+" and Now Your Account balance  is "+balance+" . \n\n");
					}
					else {
						break;
					}
					break;
					
			  default:
				  System.out.println("\nAre you sure you want to QUIT ?? \n\t Choose from below: \n\n\t\t 0 : NO\n\t\t 1 : YES");
					code3=sc.nextInt();
					if(code3==1)
					{
						System.out.println("\nDo you want to display your account balance on screen ? \n\t Choose from below: \n\n\t\t 0 : NO\n\t\t 1 : YES");
						code4=sc.nextInt();
						if(code4==1)
						{
							System.out.println("\nNow Your Account balance is "+balance+" . \n\n");
							System.out.println("\t\tTHANK YOU FOR BANKING WITH US !!  ");
							System.exit(10);
						}
						else
						{
							System.out.println("\t\tTHANK YOU FOR BANKING WITH US !!  ");
							System.exit(10);
						}
						//System.out.println(" THANK YOU !!  ");
						//System.exit(0);
					}
					else {
						break;
					}
						
				 
			
			}
		}
		

	}

}
