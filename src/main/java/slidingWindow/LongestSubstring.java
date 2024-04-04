package slidingWindow;

import java.util.HashMap;

public class LongestSubstring {
    public static void main(String[] args) {
        LongestSubstring ls = new LongestSubstring();
        System.out.println(ls.lengthOfLongestSubstring("abcabcbb"));
    }

    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> charToIndexMapping = new HashMap<>();
        int len = 0;
        int start=0;
        for(int i =0;i<s.length();i++)
        {
            char curr_char = s.charAt(i);
            if(charToIndexMapping.containsKey(curr_char))
            {
                len= Math.max(len,i-start);
                int new_start = charToIndexMapping.get(curr_char);
                start=Math.max(start,new_start+1);
            }
            if(i==s.length()-1)
            {
                len=Math.max(len,i-start+1);
            }
            charToIndexMapping.put(curr_char,i);
        }
        return len;
    }
}
