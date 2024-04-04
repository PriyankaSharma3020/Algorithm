package leetcode;

import java.util.HashMap;

public class FisrtUniqueCharInString {
    public static void main(String[] args) {

    }
    public int firstUniqChar(String s) {
        HashMap<Character,Integer> count = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            int cnt = count.getOrDefault(s.charAt(i),0);
            count.put(s.charAt(i),cnt++);
        }
        for(int i =0;i<s.length();i++)
        {
            if(s.charAt(i)>1)
                return i;
        }
        return -1;
    }
}
