package leetcode.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindANag {
    public static void main(String[] args) {

    }
    public List<Integer> findAnagrams(String s, String p) {
        int[] chP=new int[26];
        int[] chS=new int[26];
        List<Integer> output=new ArrayList<>();
        for(int i =0;i<p.length();i++)
        {
            chP[p.charAt(i)-'a']++;
        }
        for(int j =0;j<s.length();j++)
        {
            chS[p.charAt(j)-'a']++;
            //sliding window to check size
            if(j>=p.length())
            {
                chS[p.charAt(j-p.length())-'a']--;
            }
            if(Arrays.equals(chP,chS))
            {
                output.add(j-p.length()+1);
            }
        }
        return output;
    }
}
