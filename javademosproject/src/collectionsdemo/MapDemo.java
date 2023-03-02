package collectionsdemo;
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//        Map<String,Integer>marks=new HashMap<>();
        Map<String,Integer>marks=new LinkedHashMap<>();
        marks.put("BOB", 99);
        marks.put("John", 98);
        marks.put("Max", 90);
        marks.put("Tom", 94);
        marks.put("Lee", 96);
        System.out.println(marks);
        System.out.println(marks.keySet());
        System.out.println(marks.values());
        
        for(String key:marks.keySet()) {
        	System.out.println(marks.get(key));
        }
	}

}
//order of  insertion is maintained in linkedhash map
