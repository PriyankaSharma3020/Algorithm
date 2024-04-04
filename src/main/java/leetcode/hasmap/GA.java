package leetcode.hasmap;

import java.util.*;

public class GA {
    public static void main(String[] args) {

    }
    public List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String,List<String>> hm =new HashMap<String,List<String>>();

        for(int i =0;i<strs.length;i++)
        {
            char[] keyArr = strs[i].toCharArray();
            Arrays.sort(keyArr);
            if(hm.containsKey(String.valueOf(keyArr)))
            {
                List<String> val = hm.get(String.valueOf(keyArr));
                val.add(strs[i]);
            }
            List<String> val = new ArrayList<>();
            val.add(strs[i]);
            hm.put(String.valueOf(keyArr),val);
        }

        List<List<String>> ret = new ArrayList<>();
        Collection<List<String>> coll = hm.values();
        for(List<String> val: coll){
            ret.add(val);
        }
        return ret;
    }
}
