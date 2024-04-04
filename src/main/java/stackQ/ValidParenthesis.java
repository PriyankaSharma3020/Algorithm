package stackQ;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {

    }
    HashMap<Character,Character> mapping = new HashMap<>();
    {
        mapping.put(')','(');
        mapping.put('}','{');
        mapping.put(']','[');
    }

    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i =0;i<s.length();i++)
        {
            char curr = s.charAt(i);
            if(!st.isEmpty()&&mapping.containsKey(curr))
            {
                Character closingBkt=mapping.get(curr);
                if(closingBkt==st.peek())st.pop();
                else st.push(curr);
            }else {
                st.push(curr);
            }
        }
        return st.size()==0;
    }
}
