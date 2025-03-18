package ocd questions.Day 16.lc potd;
// TC: O(N^2)
// SC: O(1)
// Approach: maintain a sliding window and for every new element check for nice array condition with every element 
// between low and high. if an element is not an element giving false for the current element to be added the shift
// the low to the current element which is defying the nice array condition. simultaneously maintain a max 
// variable for the longest length of the window. At last return the max variable.
public class 2401_longest_nice_subarray {
    public int longestNiceSubarray(int[] nums) {
        int l =0;
        int h = 0;
        int max = -1;
        while(l<=h&& l<nums.length && h<nums.length)
        {
            int element = nums[h];
            for(int i=l;i<h;i++)
        {
            if((nums[i] & element)!=0)
            {
                l=i+1;
            }
            
        }
        h++;
        max = Math.max(max, h-l);
        }
        return max;
    } 
}
