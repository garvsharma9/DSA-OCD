import java.util.*;
public class intro {
    public static void main(String args[]){
        //initialization of hashset
        HashSet<Integer> set=new HashSet<>();
        //inserting in hashset
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        //checking for a key in hashset
        System.out.println(set.contains(60));
        System.out.println(set.contains(20));
        //removing
        set.remove(10);
        System.out.println(set.contains(10));
        //size
        
        set.add(20);
        System.out.println(set.size());
    }
}
