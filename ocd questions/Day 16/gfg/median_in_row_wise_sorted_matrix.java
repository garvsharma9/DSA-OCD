package ocd questions.Day 16.gfg;
//TC:O(n*m)
//SC: O(n*m)
public class median_in_row_wise_sorted_matrix {
    class Solution {
        int median(int mat[][]) {
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<mat.length;i++)
            {
                for(int j=0;j<mat[0].length;j++)
                {
                    list.add(mat[i][j]);
                }
            }
            Collections.sort(list);
            return list.get(list.size()/2);
        }
    }
}
