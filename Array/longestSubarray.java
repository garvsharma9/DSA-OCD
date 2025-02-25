package Array;
// Longest subarray with sum less than a certain value
import java.util.*;
// import java.dsa.trees.max;
import java.math.*;
public class longestSubarray {

    // Solution code
    public static int longestsubarray(int arr[],int val)
    {
        int l=0,r=0,currsum=0,maxlength=0;
        while(l<=r && r<arr.length)
        {
            currsum+=arr[r];
            if(currsum<=val)
            {
              maxlength=Math.max(maxlength, (r-l+1));

            }
            else
            {
                // Better soln

                // while(l<=r&&currsum>val)
                // {
                //     currsum-=arr[l];
                //     l++;
                // }

                // Optimal solution

                l+=1;
            }
            r++;
        }
        return maxlength;
    }


    // Driver code
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size=in.nextInt();
        int arr[]=new int[size];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<size;i++)
        {
            arr[i]=in.nextInt();
        }
        System.out.println("Enter the maximum sum");
        int val=in.nextInt();
        System.out.println("Size of longest subarray = "+longestsubarray(arr,val));
    }
}
