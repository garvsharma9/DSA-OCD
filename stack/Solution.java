import java.util.*;
class Solution {
    public static int largestRectangleArea(int[] heights) {
        int maxArea = 0;
        Stack<int[]> stack = new Stack<>(); // pair: (index, height)

        for (int i = 0; i < heights.length; i++) {
            int start = i;
            while (!stack.isEmpty() && stack.peek()[1] > heights[i]) {
                int[] top = stack.pop();
                int index = top[0];
                int height = top[1];
                maxArea = Math.max(maxArea, height * (i - index));
                start = index;
            }
            stack.push(new int[]{start, heights[i]});
        }
        System.out.println(maxArea);
        
        for (int[] pair : stack) {
            int index = pair[0];
            int height = pair[1];
            maxArea = Math.max(maxArea, height * (heights.length - index));
            System.out.println(maxArea);
        }
        return maxArea;
    }
    public static void main(String args[])
    {
        int arr[]={2,1,2};
        int maxarea=largestRectangleArea(arr);
        System.out.println(maxarea);
    }
}