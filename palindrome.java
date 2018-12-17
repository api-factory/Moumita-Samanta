package mulsoft.com;
import java.util.*;

public class palindrome {
	public static void main(String args[])
	{
		int rem,sum=0,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("This ia Palindrome number");
		}
		else
		{
			System.out.println("This ia Not a Palindrome number");
		}
	}
	

}
