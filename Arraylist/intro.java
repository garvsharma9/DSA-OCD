package Arraylist;
import java.util.*;
public class intro {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        
        //creating arraylist
        ArrayList<Integer> list=new ArrayList<>();

        adding (The elements will be added at the last of the arraylist)
        list.add(10);
        list.add(20);
        list.add(30);
        
        //printing
        System.out.println(list);
        //adding at an index
        list.add(1,40);//this will not delete 20 but shift it forward
        System.out.println(list);

        //get function
        System.out.println(list.get(1));
        //set function
        list.set(1,50);
        System.out.println(list.get(1));
        //removing an element
        list.remove(1);
        System.out.println(list);
        //size 
        System.out.println(list.size());
        //to string function returns the list in string format
        System.out.println(list.toString());
        // list.clear();
        // if(list.size()==10)
        // System.out.println("list is empty");
    }
}
