package hashmap;
import java.util.HashMap;
import java.util.Scanner;
public class maxfrequency {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the string");
        String s=in.next();
        HashMap<Character,Integer> ch=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(ch.containsKey(s.charAt(i)))
            {
                ch.put(s.charAt(i),ch.get(s.charAt(i))+1);
            }
            else
            ch.put(s.charAt(i), 1);
        }
        // System.out.println(ch);
        int maxf=0;
        char maxchar='a';
        for(char c:ch.keySet())
        {
            if(ch.get(c)>maxf){
            maxf=ch.get(c);
            maxchar=c;
            }
        }
        System.out.println("Maximum value of character is "+maxf+" and of "+maxchar);
    }
}
