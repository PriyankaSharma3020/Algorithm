package leetcode.slidingWindow;

import java.util.HashMap;

public class LS {
    public static void main(String[] args) {

        System.out.println(LS.lengthOfLongestSubstring("au"));
    }
    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> hm = new HashMap<>();
        int start=0;
        int len=0;
        for(int i =0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(i==s.length()-1)
                len =Math.max(len,i-start+1);
            if(hm.containsKey(curr))
            {
                len = Math.max(len,i-start);
                start=i;
            }

            hm.put(curr,i);
        }
        return len;
    }
}
