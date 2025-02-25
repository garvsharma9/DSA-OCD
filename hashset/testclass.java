// package hashset;
import java.util.HashSet;
public class testclass {
    public static void main(String args[])
    {
        // HashSet<HashSet<Integer>> set=new HashSet<>();
        // // int arr[]={1,2,3};
        // HashSet<Integer> set1=new HashSet<>();
        // set1.add(1);
        // set1.add(2);
        // set1.add(3);
        // set.add(set1);
        // System.out.println(set);
        // // int arr1[]={2,1,3};
        // HashSet<Integer> set2=new HashSet<>();
        // set2.add(2);
        // set2.add(1);
        // set2.add(3);
        // set.add(set2);
        // System.out.println(set.contains(set2));
        int nums[]={-1,0,1,2,-1,-4};
        for(int i=0;i<nums.length-1;i++)
        {
            for(int j=0;j<nums.length-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }   
        }
        for(int i=0;i<nums.length;i++)
        {
            System.out.println(nums[i]);
        }
    }
}
