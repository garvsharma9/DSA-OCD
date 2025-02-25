package hashmap;
import java.util.HashMap;
import java.util.*;
public class commonelement {
    public static void main(String args[])
    {
        int a[]={1,2,3,4,2,1,34,5};
        int b[]={2,6,7,3,1,67};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            map.put(a[i], 1);
        }
        System.out.println("Common elements are: ");
        for(int i=0;i<b.length;i++)
        {
            if(map.containsKey(b[i]))
            System.out.println(b[i]);
        }
    }
}
