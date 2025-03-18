package ocd questions.Day 16.gfg;
//TC: O(n)
//SC:O(1);
public class 387_first_unique_character {
    public int firstUniqChar(String s) {
        int freq[]=new int[26];
        s=s.toUpperCase();
         for(int i=0;i<s.length();i++)
         {
            int index= (int)s.charAt(i);
            freq[index-65]++;
         }
         for(int i=0;i<s.length();i++)
         {
             int index= (int)s.charAt(i);
             if(freq[index-65]==1)
             return i;
         }
         return -1;
     }
}
