//TC:O(N)
//SC: O(1)
public class 13_Roman_to_Integer {
    public int romanToInt(String s) {
        int num = 0;
        HashMap<Character, Integer> map  = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        for(int i=0;i<s.length();i++)
        {
            if(i==s.length()-1)
            num+=map.get(s.charAt(i));
            else if(s.charAt(i)=='I'&&s.charAt(i+1)=='V')
            {
                num+=4;
                i++;
            }
            else if(s.charAt(i)=='I'&&s.charAt(i+1)=='X')
            {
                num+=9;
                i++;
            }
            else if(s.charAt(i)=='X'&&s.charAt(i+1)=='L')
            {
                num+=40;
                i++;
            }
            else if(s.charAt(i)=='X'&&s.charAt(i+1)=='C')
            {
                num+=90;
                i++;
            }
            else if(s.charAt(i)=='C'&&s.charAt(i+1)=='D')
            {
                num+=400;
                i++;
            }
            else if(s.charAt(i)=='C'&&s.charAt(i+1)=='M')
            {
                num+=900;
                i++;
            }
            else
            {
                num+=map.get(s.charAt(i));
            }
        }
        return num;
    }
}
