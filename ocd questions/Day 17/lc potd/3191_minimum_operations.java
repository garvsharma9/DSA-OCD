package ocd questions.Day 17.lc potd;
//TC: O(nums.length)
//SC: O(1)
public class 3191_minimum_operations {
    public int minOperations(int[] nums) {
        int len = nums.length;
        int count=0;
        int  i =0;
        while(i<nums.length-2)
        {
         if(nums[i]==0)
         {
             count++;
             for(int j=i;j<=i+2;j++)
             {
                 if(nums[j]==1)
                 {
                     nums[j]=0;
                 }
                 else
                 {
                     nums[j]=1;
                 }
             } 
         }
         i++;
        } 
        if(nums[len-1]==1&& nums[len-2]==1)
        return count;
        else
        return -1;
     }
}
