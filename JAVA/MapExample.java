package collection;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>(); //�������� ���� ���߰� �����ҽ� <>������ ��밡��

        map.put("one", "1st");    //map�� �� �ֱ� = put
        map.put("second", "2nd");
        map.put("third", "3rd");
        // Overwrites the previous assignment
        map.put("third", "III");

        // Returns set view of keys
        Set<String> set1 = map.keySet();
        
        // Returns Collection view of values
        Collection<String> collection = map.values();
        
        System.out.println(set1 + "\n" + collection); //set1�� Ű���� ����ִ°�
        
        System.out.println("=================");
        
        Iterator<String> keys = set1.iterator();
        while(keys.hasNext()) {
        	String key = keys.next();
        	String value = map.get(key);
        	System.out.println(key + ":" + value);
        }
        

    }
}
