package mulsoft.com;
import java.util.*;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Mulesoft Training";
		String rev=reverseString(str);
		String [] s= rev.split(" ");
		System.out.println("The reverse string is ");
		for(String x:s)
		{
		StringBuffer s1= new StringBuffer(x);
		s1.reverse();
		System.out.print(s1+" ");
		}
	}
	public static String reverseString(String str)
	{
		if(str.isEmpty())
		     return str;
		else
		return reverseString(str.substring(1))+str.charAt(0);
	}
	

}
