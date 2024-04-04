package leetcode.hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        System.out.println(ga.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
    }
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String ,List<String>> mp = new HashMap<>();
        for(int i =0;i<strs.length;i++)
        {
            char[] curr=strs[i].toCharArray();
            Arrays.sort(curr);
            List<String> str = new ArrayList<>();
            str.add(strs[i]);
            mp.merge(String.valueOf(curr),str,
                    (a,b)->{
                        a.addAll(b);
                        return a;
            });
        }
        System.out.println(mp);
        List<List<String>> res = new ArrayList<>();

        //res.addAll(mp.values());
        mp.forEach((k,v)->
        {
            res.add(mp.get(k));
        });

        return res;
    }
}
