package leetcode;

import java.util.HashMap;

public class LongestSubstr {
    public static void main(String[] args) {
        LongestSubstr ls = new LongestSubstr();
        //int l =ls.lengthOfLongestSubstr("abba");
        int l =ls.lengthOfLongestSubstr("tmmzuxt");
        System.out.println(l);
    }

    public int lengthOfLongestSubstr(String s) {
        HashMap<Character,Integer> characterToIndexMapping = new HashMap<>();
        int longestLength=0;
        int start_index = 0;
        //int length=0;

        for(int i=0;i<s.length();i++)
        {

            if(characterToIndexMapping.containsKey(s.charAt(i)) )
            {

                longestLength=Math.max(longestLength,(i-start_index));

                int index = characterToIndexMapping.get(s.charAt(i));
                if(start_index>(index+1))
                    longestLength=Math.max(longestLength,(i-start_index+1));;
                start_index = Math.max(index+1,start_index);

            }else if(i==s.length()-1)
                longestLength=Math.max(longestLength,(i-start_index+1));

            characterToIndexMapping.put(s.charAt(i),i);
        }
        return longestLength;

    }
}
