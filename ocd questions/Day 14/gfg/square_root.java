package ocd questions.Day 14.gfg;
// TC: O(logn)
public class square_root {
    int floorSqrt(int n) {
        if(n==1)
        return 1;
        int l = 1;
        int h = n/2;
        while(l<=h)
        {
            int mid = l+(h-l)/2;
            if(mid*mid==n)
            return mid;
            if(mid*mid>n)
            h=mid-1;
            else
            l=mid+1;
        }
        return h;
    }
}
