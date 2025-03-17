package ocd questions.Day 15.gfg;
//TC: O(n) {n=min(a.length,b.length)}
//SC: O(1)
//Approach: iterate through both the arrays comparing elements for placing next and simultaneaously maintain the count of number of elements in the final array. if the k is greater than the length of one array the calculate the target element directly by using the count variable.
//Its easy, the code is self explanatory
public class kth_element_of_two_arrays {
    public int kthElement(int a[], int b[], int k) {
        int index1 = 0;
        int index2 = 0;
        int count = 0;
       while(index1<a.length && index2<b.length)
        {
            if(a[index1]<b[index2])
            {
                index1++;
                count++;
                if(count==k)
                return a[index1-1];
            }
            else
            {
                index2++;
                count++;
                if(count==k)
                return b[index2-1];
            }
        }
        if(index1<a.length)
        {
            return a[k-count+index1-1];
        }
        else
            return b[k-count+index2-1];
         
    }
}
