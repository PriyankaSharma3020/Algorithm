package slidingWindow;

import java.util.HashMap;

public class ls {
    public static void main(String[] args) {
        int res = findLn("eceba",2);
        System.out.println(res);
    }
    public static int findLn(String str,int k )
    {
        HashMap<Character,Integer> countMapping = new HashMap<>();
        int start=0;
        int st = start;
        int distinctChar = 0;
        int len = 0;
        while(st!=str.length())
        {

            if(!countMapping.containsKey(str.charAt(st)))
                distinctChar++;
            countMapping.merge(str.charAt(st),1,(key,v)->v+1);
            st++;
            if(distinctChar==k)
                len=Math.max(len,st-start);
            if(distinctChar>k) {
                start = st;
            }

        }
        len=Math.max(len,st-start);
        return len;

    }

}
