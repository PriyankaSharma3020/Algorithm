package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterComb {
    public static void main(String[] args) {
        HashMap<Character,String> mapping = new HashMap<>();
        mapping.put('2',"abc");
        mapping.put('3',"def");
        mapping.put('4',"ghi");
        mapping.put('5',"jkl");
        mapping.put('6',"mno");
        mapping.put('7',"pqrs");
        mapping.put('8',"tuv");
        mapping.put('9',"wxyz");
        List<String> combs = new ArrayList<>();
        backtrack(0,combs,new StringBuilder(""),"23",mapping);
        System.out.println(combs);
    }

    public static void backtrack(int index,List<String> combs, StringBuilder res, String digits, HashMap<Character, String> mapping) {
        if (res.length() == digits.length()){
            combs.add(res.toString());
            return;
        }
        Character curr = digits.charAt(index);
        String possibleCombs = mapping.get(curr);
        //iterating through all mappings of a single digit
        for(int i =0;i<possibleCombs.length();i++)
        {
            res.append(possibleCombs.charAt(i));
            //going to next digit
            backtrack(index+1,combs,res,digits,mapping);
            res.deleteCharAt(res.length()-1);
        }

    }

}
