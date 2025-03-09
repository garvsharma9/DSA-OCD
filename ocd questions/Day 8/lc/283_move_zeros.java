package Day 8.lc;

public class 283_move_zeros {
    public void moveZeroes(int[] nums) {
        int temp;
        for(int i=0;i<nums.length-1;i++)
        {
         if(nums[i]==0)
         {
             int j=i+1;
             while(j<nums.length&&nums[j]==0)
             {
                 j++;
             }
 
             if(j<nums.length){
                 temp=nums[i];
             nums[i]=nums[j];
             nums[j]=temp;
             }
         }
        } 
     }
    
}
