package Array;
import java.util.*;
public class peakelement {
    public static void main(String args[])
    {
        peakelement ob=new peakelement();
        int arr[]={-3,-5};
        int result=ob.peakElement(arr);
        System.out.println(result);
    }
    public int peakElement(int[] arr) {
        int indexpeak=-1;
        if(arr.length==1)
        indexpeak=0;
        else{
        for(int i=0;i<arr.length;i++)
        {
            if(i==0)
            {
                if(arr[i]>arr[i+1])
                indexpeak=i;
            }
            if(i==arr.length-1)
            {
                if(arr[i]>arr[i-1])
                {
                    indexpeak=i;
                }
            }
            if(i>0&&i<arr.length-1)
            {
                if(arr[i]>arr[i+1]&&arr[i]>arr[i-1])
                indexpeak=i;
            }
        }}
        return indexpeak;
    }
    
}
