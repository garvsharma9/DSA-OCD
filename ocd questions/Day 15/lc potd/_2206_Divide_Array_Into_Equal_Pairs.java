package ocd questions.Day 15.lc potd;

// TC: O(N)
// SC: O(1)
//Approach: simply calculate the frequency of each number in given array and check for it to be a multiple of 2 at last.
public class _2206_Divide_Array_Into_Equal_Pairs {
    public boolean divideArray(int[] nums) {
        int freq[]= new int[501];
        for(int num:nums)
        {
           freq[num]++;
        }   
        for(int f:freq)
        {
           if(f%2!=0)
           return false;
        }
        return true;
       }
}
