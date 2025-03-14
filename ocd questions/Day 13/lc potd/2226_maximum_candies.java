package ocd questions.Day 13.lc potd;
//TC: O(N*log(R))
//SC: O(1)
public class 2226_maximum_candies {
    public int maximumCandies(int[] candies, long k) {
        Arrays.sort(candies);
        long l=1;
        long h=candies[candies.length-1];
        int max = 0;
        while(l<=h)
        {
         long mid = l+(h-l)/2;
         if(canAssign(candies, mid,k))
         {
             max = (int)mid;
             l=mid+1;
         }
         else
         h=mid-1;
        } 
        return max;
     }
     public boolean canAssign(int candies[], long mid, long k)
     {
         long count = 0;
         for(int candie: candies)
         {
             
             count+=candie/mid;
         }
         return count>=k;
     }
}
