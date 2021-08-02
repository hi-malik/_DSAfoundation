import java.io.*;
import java.util.*;

public class Introduce{
    public static void main(String [] args){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India", 135);
        hm.put("China", 200);
        hm.put("Pak", 40);
        hm.put("US", 20);
        hm.put("UK", 10);
        
        System.out.println(hm);
        
        hm.put("Germany", 6);
        hm.put("US", 25);
        
        System.out.println(hm);
        
        System.out.println(hm.get("India"));
        System.out.println(hm.get("Japan"));
        
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Japan"));
        
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        
        for(String key: hm.keySet()){
            Integer val = hm.get(key);
            System.out.println(key + " : " + val);
        }
    }
}