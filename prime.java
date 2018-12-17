package mulsoft.com;
import java.util.*;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp;
		boolean isPrime=true;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		int num=sc.nextInt();
		for(int i=2;i<=num/2;i++)
		{
			temp=num%i;
			if(temp==0)
			{
				isPrime=false;
				break;
			}
		}
		if(isPrime)
		{
			System.out.println(num+" is a prime number");
		}
		else
		{
			System.out.println(num+" is not a prime number");
		}
		

	}

}
