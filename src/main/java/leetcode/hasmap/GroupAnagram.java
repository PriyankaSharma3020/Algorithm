package leetcode.hasmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
    public static void main(String[] args) {
        System.out.println(GroupAnagram.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public static List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hm=new HashMap<>();
        for(int i =0;i< strs.length;i++)
        {
            char[] s=strs[i].toCharArray();
            Arrays.sort(s);
            List<String> l = new ArrayList<>();
            l.add(strs[i]);
            hm.merge(String.valueOf(s),l,
                    (v1,v2)->{
                    v1.addAll(l);
                    return v1;
                    }
                    );

        }
        System.out.println(hm);
        List<List<String>> res = new ArrayList<>();
        hm.forEach(
                (k,v)->{
                    res.add(hm.get(k));
                }
        );
        return res;
    }
}
