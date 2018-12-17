package mulsoft.com;
import java.util.*;
public class LargeElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,max;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The number of elements in the array: ");
		num=sc.nextInt();
		int a[]=new int[num];
		System.out.println("Enter The Elements of the array: ");
		for(int i=0;i<num;i++)
		{
			a[i]=sc.nextInt();
		}
		max=a[0];
		for(int i=0;i<num;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
		}
		System.out.println("The maximum value: "+max);
	}

}
