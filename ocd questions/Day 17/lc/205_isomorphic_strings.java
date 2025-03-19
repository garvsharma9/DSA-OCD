package ocd questions.Day 17.lc;
//TC: O(N) (N: length of string)
//SC: O(N)
public class 205_isomorphic_strings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map1 = new HashMap<>();
        HashMap<Character, Character> map2 = new HashMap<>();
        boolean flag1 = true;
        for(int i=0;i<s.length();i++)
        {
           if(!map1.containsKey(s.charAt(i)))
           {
               map1.put(s.charAt(i), t.charAt(i));
           }
           else
           {
               if(map1.get(s.charAt(i))!=t.charAt(i))
               {
                   flag1 = false;
                   break;
               }
           }
        }   
        boolean flag2 = true;
       for(int i=0;i<s.length();i++)
        {
           if(!map2.containsKey(t.charAt(i)))
           {
               map2.put(t.charAt(i), s.charAt(i));
           }
           else
           {
               if(map2.get(t.charAt(i))!=s.charAt(i))
               {
                   flag2 = false;
                   break;
               }
           }
        }   
        return flag1&&flag2;
       }
}
