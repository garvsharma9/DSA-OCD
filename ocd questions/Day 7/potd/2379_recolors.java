class Solution {
    public int minimumRecolors(String blocks, int k) {
     int minChange = Integer.MAX_VALUE;
     int i=0;
     int j=k-1;
     while(j<blocks.length())
     {
        int count = 0;
        for(int h=i;h<=j;h++)
        {
            if(blocks.charAt(h)=='W')
            count++;

        }
            minChange = Math.min(minChange, count);
            i++;
            j++;
     }   
     return minChange;
    }
}