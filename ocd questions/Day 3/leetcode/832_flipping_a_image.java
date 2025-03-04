package ocd questions.Day 3.leetcode;
class 832_flipping_a_image {
    public int[][] flipAndInvertImage(int[][] image) {
        int result[][]=new int[image.length][image[0].length];
        int row=image.length;
        int col=image[0].length;
        for(int i=0;i<row;i++)
        {
            int a=0;
            for(int j=col-1;j>=0;j--)
            {
                result[i][j]=image[i][a++];
                if(result[i][j]==0)
                result[i][j]=1;
                else
                result[i][j]=0;
            }
        }
        return result;
    }
}
