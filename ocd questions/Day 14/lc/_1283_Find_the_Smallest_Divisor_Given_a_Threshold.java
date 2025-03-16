package ocd questions.Day 14.lc;
// TC: O(mlog(n))
// SC: O(1)
public class _1283_Find_the_Smallest_Divisor_Given_a_Threshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int l = 1;
        // Arrays.sort(nums);
        int h =1000000;
        int ans = h;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(check(nums, threshold, mid))
            {
                ans = mid;
                h=mid-1;
            }
            else l=mid+1;
        }
        return ans;
    }
    boolean check(int nums[], int threshold, int mid)
    {
        int count =0;
        for(int num:nums)
        {
            count+=(int) Math.ceil((float)num/mid);
        }
        return count<=threshold;
    }
}
