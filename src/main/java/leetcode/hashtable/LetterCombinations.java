package leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinations {
    public static void main(String[] args) {
        LetterCombinations ls=new LetterCombinations();
        System.out.println(ls.letterCombinations("23"));
    }
    static HashMap<Character, String> hm =new HashMap<>();
    static {
        hm.put('2',"abc");
        hm.put('3',"def");
        hm.put('4',"ghi");
        hm.put('5',"jkl");
        hm.put('6',"mno");
        hm.put('7',"pqrs");
        hm.put('8',"tuv");
        hm.put('9',"wxyz");;
    }
    public List<String> letterCombinations(String digits) {


        List<String> res = new ArrayList<>();
        letterCombinationsbackTrack(res,"",digits,0);
        return res;
    }

    public void letterCombinationsbackTrack(List<String> res,String curr,String digits, int curr_position)
    {
        //breaking clause to add in result
        if(curr.length()==digits.length())
        {
            res.add(curr);  //res-> ad
            return ;
        }
        //2  //3
        char c =digits.charAt(curr_position);
        String val=hm.get(c); //abc  //def
        for(int i=0;i<val.length();i++) {
            //add
            curr+=val.charAt(i); //curr=a  //curr=ad
            //backtrack
            letterCombinationsbackTrack(res,curr,digits,curr_position+1);
            //remove
            curr=curr.substring(0,curr.length()-1); //curr="
        }
    }
}
