package mulsoft.com;
import java.util.*;

public class MapDataToList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "Moumita");
		map.put(2, "Sandip");
		map.put(3, "Subhrata");
		map.put(4, "Mahi");
		map.put(5, "Vishal");
		
		List<Integer> keyList=new ArrayList(map.keySet());
		List<String> valueList=new ArrayList(map.values());
		
		System.out.println("Key List: "+keyList);
		System.out.println("Key Values: "+valueList);

	}

}
