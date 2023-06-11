import java.util.HashMap;
import java.util.*;
public class Hashing{
    public static void main(String args[]){
        // create hashmap
        HashMap<String,Integer> hm= new HashMap<>();

        // insert elements   ---->>>>>> O(1)
        hm.put("India",100);
        hm.put("China",150);
        hm.put("US",50);
        hm.put("Indonesia",6);
        hm.put("Nepal",5);

        //Iterate
        // to iterate i will create a set
        Set<String> keys = hm.keySet();
        System.out.println(keys);

        for (String k : keys) {
            System.out.println("keys="+k+ ",value="+hm.get(k));                        
        }
        // hm.put("India",107);

        // System.out.println(hm);

        // //get --->>> O(1)          
        // int population = hm.get("India");
        // System.out.println(population);

        // System.out.println(hm.get("Indonesia"));

        // //containsKey --->> O(1)
        // System.out.println(hm.containsKey("India")); //returns true
        // System.out.println(hm.containsKey("Indonesia")); //returns false

        // //remove -->>> O(1)
        // System.out.println(hm.remove("India"));
        // System.out.println(hm);

        //size
        //System.out.println(hm.size());
        
        // //isEmpty
        // hm.clear();
        // System.out.println(hm.isEmpty());  //returns false bcoz hashmap is not empty

         
    }
}