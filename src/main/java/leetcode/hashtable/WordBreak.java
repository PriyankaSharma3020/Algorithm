package leetcode.hashtable;

import java.util.List;

public class WordBreak {
    public static void main(String[] args) {

    }
    public boolean wordBreak(String s, List<String> wordDict) {
        return false;
    }
}

/*
f(int index)
{

if(hm.contains(str.substring()))
    return true;
 int i=index;
  while(i>=0&& !hm.contains(str.substring(0,i)))
     i--;
     if(i>=0)
        return f(i-1);
     else
           return false;


}
 */
