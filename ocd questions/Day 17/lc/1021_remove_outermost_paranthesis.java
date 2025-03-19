package ocd questions.Day 17.lc;
//TC : O(n) (n=length of give string)
//Sc: O(1)
public class 1021_remove_outermost_paranthesis {
    public String removeOuterParentheses(String s) {
        
        String result="";
        String temp="";
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='('){
                count++;
                temp+=s.charAt(i);
            } 
            else{
                count--;
                temp+=s.charAt(i);
                if(count==0)
                {
                    result+=temp.substring(1,temp.length()-1);
                    temp="";
                }
            }
        }
        System.out.println(result);
        return result;
    }
}
