package backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LC {
    public static void main(String[] args) {

    }
    public List<String> letterCombinations(String digits) {
         Map<Character, String> letters = Map.of(
                '2', "abc", '3', "def", '4', "ghi", '5', "jkl",
                '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
         List<String> combs = new ArrayList<>();
        // backtrack(digits,letters,combs);
        return null;

    }
}
