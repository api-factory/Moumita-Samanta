package mulsoft.com;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num=sc.nextInt();
		if(num%2==0)
		{
			System.out.println("This is even Number");
		}
		else
		{
			System.out.println("This is Odd Number");
		}
	}

}
