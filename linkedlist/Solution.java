import java.util.*;
class Solution {
    public boolean isAnagram(String s, String t) {
    HashMap<Character,Integer> map1=new HashMap<>();
    HashMap<Character,Integer> map2=new HashMap<>();
    if(s.length()!=t.length())
    return false;
    
        for(int i=0;i<s.length();i++)
        {
            if(!map1.containsKey(s.charAt(i)))
            map1.put(s.charAt(i),1);
            else
            map1.put(s.charAt(i),map1.get(s.charAt(i))+1);
            if(!map2.containsKey(t.charAt(i)))
            map2.put(t.charAt(i),1);
            else
            map2.put(t.charAt(i),map2.get(t.charAt(i))+1);
        }
        System.out.println(map1);
        System.out.println(map2);
        for(Character ch:map1.keySet())
        {
            if(map1.get(ch)!=map2.get(ch)||!map2.containsKey(ch))
            return false;
        }
        return true;
    
    }
    public static void main(String args[])
    {
        Solution ob=new Solution();
        ob.isAnagram("aabbbb", "aaaabb");
    }
}