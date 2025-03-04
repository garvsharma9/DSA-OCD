package ocd questions.Day 3.leetcode;

public class 1128_Number_of_Equivalent_Domino_Pairs {
    public int numEquivDominoPairs(int[][] dominoes) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int count=0;
        for(int arr[]:dominoes)
        {
            int max=Math.max(arr[0],arr[1]);
            int min=Math.min(arr[0],arr[1]);
            int key = min*10+max;
            int pairs=map.getOrDefault(key,0);
            count+=pairs;
            map.put(key,pairs+1);
        }
        return count;
    }
}
