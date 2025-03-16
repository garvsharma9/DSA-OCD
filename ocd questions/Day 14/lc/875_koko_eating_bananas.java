package ocd questions.Day 14.lc;
// TC: O(mlog(n))
// SC: O(1)
public class 875_koko_eating_bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        Arrays.sort(piles);
        int high = piles[piles.length-1];
        int ans = high;
        while(l<=high)
        {
          int mid = l+(high-l)/2;
          if(check(piles, h, mid))
          {
              high=mid-1;
              ans = mid;
          }
          else
          {
              l=mid+1;
          }
        }
        return ans;
      }
      boolean check(int piles[], int h,int mid)
      {
          long count = 0;
          for(int pile:piles)
          {
              count+=(int)Math.ceil((double)pile/mid);
          }
          return count<=h;
      }
}
