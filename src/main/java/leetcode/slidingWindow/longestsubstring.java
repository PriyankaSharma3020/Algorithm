package leetcode.slidingWindow;

import java.util.HashMap;

public class longestsubstring {
    public static void main(String[] args) {
        longestsubstring ls = new longestsubstring();
        int res=ls.lengthOfLongestSubstring("tmmzuxt");
        System.out.println(res);
    }
    public int lengthOfLongestSubstring(String s) {

        int len=0;
        int max_len=0;
        int start=0;
        HashMap<Character,Integer>  mp=new HashMap<>();
        for(int i =0;i<s.length();i++)
        {
            char c = s.charAt(i);

            if(mp.containsKey(c)){
                len=i-start;
                max_len=Math.max(max_len,len);
               int st=1+ mp.get(c);
              // if(start<st)
               //    len=0;
               start=Math.max(st,start);
                len=i-start;
            }else if(i==s.length()-1)
            {
                //calcl len
                len=i-start+1;
                max_len=Math.max(max_len,len);
            }
            len++;
            mp.put(c,i);
        }
        return max_len;
    }
}
