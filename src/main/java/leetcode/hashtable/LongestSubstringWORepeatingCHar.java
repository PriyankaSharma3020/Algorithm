package leetcode.hashtable;

import java.util.HashMap;

public class LongestSubstringWORepeatingCHar {
    public static void main(String[] args) {

    }

    public int lengthOfLongestSubstring(String s) {

        HashMap<Character,Integer> done = new HashMap<>();
        int start=0;
        int len=0;
        for(int i =0;i<s.length();i++)
        {
            Character curr_char=s.charAt(i);
            if(done.containsKey(curr_char))
            {
                len=Math.max(len,i-start);
                start=Math.max(start,done.get(curr_char)+1);
            }
            if(i==s.length()-1)
            {
                len=Math.max(len,i-start+1);
            }
            done.put(curr_char,i);
        }
        return len;
    }
}
