package slidingWindow;

import java.util.HashMap;

public class lsr {
    public static void main(String[] args) {

    }
    public int getlr(String str){
        HashMap<Character,Integer> mapping = new HashMap<>();
        int len =0;
        int start=0;
        for(int i =0;i<str.length();i++)
        {
          if(mapping.containsKey(str.charAt(i)))
          {
              len=Math.max(len,i-start);
              start=Math.max(i,mapping.get(str.charAt(i)));
          }
          if(i==str.length()-1)
          {
              len=Math.max(len,i-start+1);
              start=i;
          }
          mapping.put(str.charAt(i),mapping.getOrDefault(str.charAt(i),0)+1);
        }
        return len;
    }
}
