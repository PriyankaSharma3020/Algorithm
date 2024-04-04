package leetcode.slidingWindow;

import java.util.HashMap;

public class LSWNoRepChar {
    public static void main(String[] args) {

    }

    public int findLongestStr(String input)
    {
        int start=0;
        int longest_len = 0;
        HashMap<Character,Integer> hm = new HashMap<>();
        for(int i =0;i<input.length();i++)
        {
            char curr = input.charAt(i);
            if(hm.containsKey(curr))
            {
               longest_len=Math.max(longest_len,i-start);
                int new_index=hm.get(curr)+1;
                if(new_index>start)
                    start=hm.get(curr)+1;
            }else if(i==input.length()-1)
                longest_len=Math.max(longest_len,i-start+1);
            hm.put(curr,i);
        }
        return longest_len;
    }

}
