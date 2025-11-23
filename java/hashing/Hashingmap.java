package hashing;
// package HashMap;
import java.util.*;

public class Hashingmap 
{
    public static void main(String[] args) {
        // country(key) , population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //insert
        map.put("India", 120);
        map.put("US", 50);
        map.put("China", 140);
        System.out.println(map);
        System.out.println("------------"); 

        //just imagine population is increase in china
        map.put("China", 160);
        System.out.println(map);

        // Search 
        if(map.containsKey("China"))
            System.out.println("Key is present in the Map");
        else
            System.out.println("Key is not present in the Map");

        System.out.println("------------");

        // to print the value of key
        System.out.println(map.get("China"));
        System.out.println(map.get("Indonesia"));
        System.out.println("------------");

        // print key and value using entrySet
        for(Map.Entry<String, Integer> e : map.entrySet())
        {
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        System.out.println("------------");

        //print key and value using keyset
        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+" "+map.get(key));
        }
    }
}
