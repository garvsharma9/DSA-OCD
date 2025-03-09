public class 3364_minimum_positive_sum {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int minsum = Integer.MAX_VALUE;
        for(int i=l;i<=r;i++)
        {
            int currsum = 0;
            for(int j=0;j<i;j++)
            {
                currsum+=nums.get(j);
            }
            if(currsum>0)
            minsum = Math.min(minsum, currsum);
            int left = 0, right = i;
            while(right<nums.size())
            {
                currsum-=nums.get(left);
                currsum+=nums.get(right);
                left++;
                right++;
                if(currsum>0)
                minsum = Math.min(minsum, currsum);
            }

        }
        if(minsum == Integer.MAX_VALUE)
        return -1;
        return minsum;
    }
}
