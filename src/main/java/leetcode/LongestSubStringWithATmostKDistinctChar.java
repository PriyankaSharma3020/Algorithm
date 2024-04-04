package leetcode;

import java.util.HashMap;

public class LongestSubStringWithATmostKDistinctChar {
    public static void main(String[] args) {
        int s = LongestSubStringWithATmostKDistinctChar.lengthOfLongestSubstringKDistinct("aa",0);
        System.out.println(s);
    }

    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        HashMap<Character,Integer> mapping = new HashMap<>();
        int curr =0;
        int max_length=0;
        int start=0;
        int count=0;
        while(curr<s.length())
        {
            if (count == k && !mapping.containsKey(s.charAt(curr))) {
                count--;
                start++;
                max_length = Math.max(max_length, curr - start+1);
                //reset count on increasing start
            }
            else{
                if (!mapping.containsKey(s.charAt(curr))) {
                    mapping.put(s.charAt(curr), 1);
                    count++;
                    }
                else
                    mapping.computeIfPresent(s.charAt(start),(key,val)->
                        val+=1);
                curr++;
                if(curr==s.length())
                    max_length = Math.max(max_length, curr - start);
                }
            }

        return max_length;
    }
}
