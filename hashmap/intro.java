package hashmap;
import java.util.*;
public class intro {
    public static void main(String args[])
    {
        HashMap<String, Integer> population=new HashMap<>();
        population.put("India",33);
        population.put("Australia", 43);
        population.put("Sri lanka", 2);
        System.out.println(population.get("India")); 
        System.out.println(population.containsKey("kenya"));
        for(String s:population.keySet())
        {
            // System.out.println(s);
        }
        System.out.println(population.size()); //size of hashmap
        
        //remove from hashmap
        population.remove("India");
        System.out.println(population.containsKey("India"));
        System.out.println(population);
        //traversing the hashmap
        for(String s:population.keySet())
        {
            System.out.println(s);
        }
    }
}
