public class pairwithmaxsum
{
    public int pairWithMaxSum(int arr[]) {
    int maxsum = -1;
    for(int i=0;i<arr.length-1;i++)
    {
       maxsum = Math.max(maxsum, arr[i]+arr[i+1]); 
    }
    return maxsum;
}}
  