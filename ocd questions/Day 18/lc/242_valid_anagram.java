//TC: O(N)
//SC: O(N)
public class 242_valid_anagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        if(s.length()!=t.length())
        return false;
        s=s.toLowerCase();
        t=t.toLowerCase();
        
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
           if(map1.equals(map2))
            return true;
            return false;
        
        }
}
