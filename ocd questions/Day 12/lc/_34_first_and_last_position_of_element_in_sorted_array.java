//TC: O(logn)
//SC: O(1)
public class _34_first_and_last_position_of_element_in_sorted_array {
    public int[] searchRange(int[] nums, int target) {
        int l=0, h=nums.length-1;
        int left = -1;
        int right = -1;
        while(l<=h&&h<nums.length)
        {
            int mid = (l+h)/2;
            if(nums[mid]>target)
            h=mid-1;
            if(nums[mid]<target)
            l=mid+1;
            if(nums[mid]==target)
            {
                h=mid-1;
                left=mid;
            }
        }
        l=0;
        h=nums.length-1;
        while(l<=h&&h<nums.length)
        {
            int mid = (l+h)/2;
            if(nums[mid]>target)
            h=mid-1;
            if(nums[mid]<target)
            l=mid+1;
            if(nums[mid]==target)
            {
                l=mid+1;
                right=mid;
            }
        }
        int res[]={left,right};
        return res;
    }    
}
