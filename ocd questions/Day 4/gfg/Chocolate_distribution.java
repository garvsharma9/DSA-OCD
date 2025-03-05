import java.util.ArrayList;
import java.util.Collections;

public class Chocolate_distribution {
     public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        Collections.sort(arr);
        int mindiff=(int)Double.POSITIVE_INFINITY;
        int j=m-1;
        int i=0;
        while(j<arr.size())
        {
            mindiff=Math.min(mindiff, (arr.get(j)-arr.get(i)));
            j++;
            i++;
        }
        return mindiff;
    }
}
