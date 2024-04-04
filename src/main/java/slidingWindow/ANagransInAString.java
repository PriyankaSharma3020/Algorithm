package slidingWindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ANagransInAString {
    public static void main(String[] args) {
        ANagransInAString as = new ANagransInAString();
        System.out.println(as.findAnagrams("cbaebabacd","abcc"));
    }
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ret = new ArrayList<>();

        String curr_target =p;
        int curr_len=0;
        int start=0;
        HashMap<Character,Integer> mapping = new HashMap<>();
        for(int i=0;i<p.length();i++)
        {
            mapping.merge(p.charAt(i),1,(x,y)->y+1);
        }
        System.out.println(mapping);
        for(int i =0;i<s.length();i++)
        {
            char curr_char = s.charAt(i);


            if(mapping.get(curr_char)!=null )
            {
                if(mapping.get(curr_char)!=null && mapping.get(curr_char)<0){
                    mapping.remove(curr_char);
                }else {
                    mapping.computeIfPresent(curr_char, (v1, v2) -> {
                        return Integer.valueOf(v2 - 1);
                    });
                    System.out.println(mapping);
                    curr_len++;
                }
            }else{
                start=i;
                curr_len=0;

            }
            if(curr_len==p.length()&&mapping.isEmpty()) {
                ret.add(start);
                start=i+1;
            }



        }
        return ret;
    }
}
