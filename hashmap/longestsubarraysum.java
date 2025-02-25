import java.util.*;
import java.math.*;;
public class longestsubarraysum {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the length of array");
        int l=in.nextInt();
        int arr[]=new int[l];
        System.out.println("Enter elements in the array");
        for(int i:arr)
        {
            arr[i]=in.nextInt();
        }
        int result = maxlength(arr,l);
        System.out.println("Result = "+result);
    }
    public static int maxlength(int arr[], int k)
    {
        HashMap<Integer,Integer> map=new HashMap<>();
        int sum=0;int maxlength=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            if(sum==k)
            {
                maxlength=i+1;
            }
            if(!map.containsKey(sum))
            map.put(sum, i);
            if(map.containsKey(sum-k))
            maxlength=Math.max(maxlength, i-map.get(sum-k));
        }
        return maxlength;
    }
}
