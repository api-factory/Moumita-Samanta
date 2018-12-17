package mulsoft.com;
import java.util.*;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int temp,rem,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num=sc.nextInt();
		temp=num;
		while(num>0)
		{
			rem=num%10;
			num=num/10;
			result=result+(rem*rem*rem);
		}
		if(result==temp)
		{
			System.out.println("This is a Armstrong Number");
		}
		else
		{
			System.out.println("This is not a Armstrong Number");
		}
		

	}

}
