package Day 13.lc;

public class _33_search_rotated_sorted_array {
    public int search(int[] nums, int target) {
        int l=0;
        int h=nums.length-1;
        while(l<=h&&h<nums.length)
        {
            int mid=(l+h)/2;
            if(nums[mid]==target)
            return mid;

            else if(nums[mid]>=nums[l])//if left half is sorted 
            {
                if(target>=nums[l]&&target<=nums[mid])//first check left
                {
                    h=mid-1;
                }
                else
                {
                    l=mid+1;
                }
            }
            else//if right half is sorted 
            {
                if(target>=nums[mid]&&target<=nums[h])//first check right
                {
                    l=mid+1;
                }
                else
                {
                    h=mid-1;
                }
            }

        }
        return -1;
    }
}
