package ocd questions.Day 15.lc;
//TC: O(rowlog(col))
//SC: O(col)
//Approach: Iterate through every row of 2d matrix and then apply binary search on every row to find the target. Return true if target is present or else return false.
public class 74_search_a_2d_matrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        for(int i=0;i<matrix.length;i++)
        {
            int nums[]=matrix[i];
            int left=0;
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
