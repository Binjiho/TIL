package collection;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(); //선언형을 보고 유추가 가능할시 <>연산자 사용가능

        map.put("one", "1st");    //map에 값 넣기 = put
        map.put("second", "2nd");
        map.put("third", "3rd");
        // Overwrites the previous assignment
        map.put("third", "III");

        // Returns set view of keys
        Set<String> set1 = map.keySet();
        
        // Returns Collection view of values
        Collection<String> collection = map.values();
        
        System.out.println(set1 + "\n" + collection); //set1은 키값만 들어있는것
        
        System.out.println("=================");
        
        Iterator<String> keys = set1.iterator();
        while(keys.hasNext()) {
        	String key = keys.next();
        	String value = map.get(key);
        	System.out.println(key + ":" + value);
        }
        

    }
}
