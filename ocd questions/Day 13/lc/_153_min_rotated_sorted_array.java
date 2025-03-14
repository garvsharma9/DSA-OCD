package Day 13.lc;

public class _153_min_rotated_sorted_array {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int min = nums[0];
        while(left<=right)
        {
            int mid = (left+right)/2;
            if(nums[left]<=nums[mid]) //left half is sorted so store its minimum value
            {
                min = Math.min(min,nums[left]);
                left = mid+1;
            }
            else //if right half is sorted
            {
                min = Math.min(min, nums[mid]);
                right = mid-1;
            }
        }
        return min;
    }
}
