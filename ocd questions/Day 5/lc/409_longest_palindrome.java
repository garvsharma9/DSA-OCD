package Day 5.lc;

public class 409_longest_palindrome {
    public int longestPalindrome(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int ans=0;
        int length=s.length();
        for(int i=0;i<s.length();i++)
        {
         char ch=s.charAt(i);
         if(map.containsKey(ch))
             map.put(ch,map.get(ch)+1);
         else
             map.put(ch,1);
        } 
        for(char key:map.keySet())
        {
         ans+=map.get(key)/2;
         length-=(map.get(key)/2)*2;
        }
  
        if(length>0)
        return ans*2+1;
        return ans*2;
     }
}
