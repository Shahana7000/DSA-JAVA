import java.util.Map;
import java.util.TreeMap;
import java.util.Map.Entry;
import java.util.HashMap;
public class HashMapDemo {
    public static void main(String args[]){
        Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("shahana",22);
        map.put("saksham", 20);
        map.put("alfi", 15);
        map.put("siddharth", 18);
        map.put("shahana", 25);
        map.put("saksham", 21);
        map.put("saksham", 20);



        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());



    }
    map.remove( "saksham");
    System.out.println(map);
    
}
}