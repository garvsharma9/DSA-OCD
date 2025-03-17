package ocd questions.Day 15.lc;
//TC: O(rowlog(col))
//SC: O(col)
//Approach: Iterate through every row of 2d matrix and then apply binary search on every row to find the target.If the target is greater than the last elemnent of the row the skip the current iteration and move on to the next one. Return true if target is present or else return false.
public class 240_Search_a_2D_Matrix_II {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            
            int nums[]=matrix[i];
            int left=0;
            if(target>nums[nums.length-1])
            continue;
        int right=nums.length-1;
        while(left<=right)
        {
        int mid = (left+right)/2;
            if(nums[mid]==target)
            {
                return true;
            }
            if(target>nums[mid])
            left=mid+1;
            else
            right=mid-1;
        }
        }
    return false;
    }
}
