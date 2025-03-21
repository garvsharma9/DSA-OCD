package ocd questions.Day 19.lc;

public class _1614_ {
    public int maxDepth(String s) {
        int count = 0;
        int max = 0;
        for(int i=0;i<s.length();i++)
        {
           if(s.charAt(i)=='(')
           {
           count++;
           max = Math.max(count,max);
           }
           if(s.charAt(i)==')')
           count--;
        }
        return max;   
       }
}
