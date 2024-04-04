package leetcode.slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAnagrams {
    public static void main(String[] args) {

    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ret = new ArrayList<>();
        int s_len=s.length();
        int p_len=p.length();
        int[] s_arr=new int[s.length()];
        int[] p_arr=new int[p.length()];
        for(int i =0;i<p_arr.length;i++)
        {
            p_arr[p.charAt(i)-'a']++;
        }
        for(int j=0;j<p.length();j++)
        {
            s_arr[s.charAt(j)-'a']++;
            if(j>=p.length())
            {
                s_arr[s.charAt(j-p_len)]--;
            }
            if(Arrays.equals(p_arr,s_arr))
            {
                ret.add(j-p_len+1);
            }
        }
        return ret;
    }
}
