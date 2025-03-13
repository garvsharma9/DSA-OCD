//TC: O(logn)
//SC: O(1)

public class _35_search_insert_position {
    public int searchInsert(int[] nums, int target) {
        int l = 0;
        int h = nums.length-1;
        while(l<=h)
        {
          int mid = (l+h)/2;
          if(target>nums[mid])
          l=mid+1;
          if(target<nums[mid])
          h=mid-1;
          if(target==nums[mid])
          return mid;
        }  
        return l;
      }
}
