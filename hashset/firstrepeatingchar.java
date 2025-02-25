import java.util.*;
public class firstrepeatingchar {
    public static void main(String args[])
    {
        String  st= "abcd";
        firstrepeating(st);
    }
    public static void firstrepeating(String st)
    {
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(set.contains(ch))
            {
                System.out.println(ch);
                return;
            }
            else
            set.add(ch);
        }
        System.out.println("-1");
        return;
    }
}
