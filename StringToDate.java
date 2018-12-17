package mulsoft.com;
import java.util.Date;
import java.text.SimpleDateFormat;

public class StringToDate {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		
    String str="17/12/2018";
    Date date1=new SimpleDateFormat("dd/MM/yyyy").parse(str);
    System.out.println(str+"\t"+date1);
	}

}
