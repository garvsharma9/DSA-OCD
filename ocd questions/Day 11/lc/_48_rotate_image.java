import java.util.*;
import java.util.Collection;
class _48_rotate_image {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int row=0;
        int col=-1;
        while(row<n)
        {
            col++;
            for(int i=col;i<=n-1;i++)
            {
                swap(matrix,row,i);
            }
            row++;
        }
        for(int i=0;i<n;i++)
        {
           int l=0;
           int r=n-1;
           while(l<r)
           {
            int temp=matrix[i][l];
            matrix[i][l]=matrix[i][r];
            matrix[i][r]=temp;
            r--;
            l++;
           }
        }
    }
    void swap(int matrix[][],int a, int b)
    {
        int temp=matrix[a][b];
        matrix[a][b]=matrix[b][a];
        matrix[b][a]=temp;
    }
}
