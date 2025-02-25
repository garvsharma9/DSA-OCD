package hashmap;
import java.util.*;
public class subset {
    public static void main(String args[])
    {
        int a[]={10,5,2,23,19};
        int b[]={19,5,3};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            if(map.containsKey(a[i]))
            {
                int temp=map.get(a[i]);
                map.put(a[i],temp+1);
            }
            else
            {
                map.put(a[i],1);
            }
        }
        boolean flag=true;
         HashMap<Integer,Integer> map1=new HashMap<>();
         for(int i=0;i<b.length;i++)
        {
            if(map1.containsKey(b[i]))
            {
                int temp=map1.get(b[i]);
                map1.put(b[i],temp+1);
            }
            else
            {
                map1.put(b[i],1);
            }
        }
        for(int i=0;i<b.length;i++)
        {
            if(map.containsKey(b[i]))
            {
                if(map1.get(b[i])>map.get(b[i]))
                {
                    flag=false;
                }
            }
            else
            {
                flag=false;
            }
        }
        System.out.println(flag);
        // return flag;
    }
}
