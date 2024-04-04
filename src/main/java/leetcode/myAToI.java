package leetcode;

public class myAToI {
    public static void main(String[] args) {
        int res = myAToI.myAtoi("-91283472332");
        System.out.println(res);
        //Thread task =
        Thread t1 = new Thread();
        t1.start();
    }
    public static int myAtoi(String s) {

        int ret = 0;
        int start_index= 0;
        boolean negative_sign=false;
        long value=0;
        //ignore leading whitespaces
        while(start_index<s.length())
        {
            if(Character.isSpaceChar(s.charAt(start_index)))
                start_index++;
            else break;
        }
        //check for sign now
        if(start_index<s.length()&&s.charAt(start_index)=='-') {
            negative_sign = true;
            start_index++;
        }
        else if(start_index<s.length()&&s.charAt(start_index)=='+') {
            negative_sign = false;
            start_index++;
        }
        while(start_index<s.length() && Character.isDigit(s.charAt(start_index)))
        {
            int val = s.charAt(start_index)-'1';
            value = (value*10)+(val+1);
            start_index++;
            if(value>Integer.MAX_VALUE && !negative_sign) {
                value = Integer.MAX_VALUE;
                break;
            }
            if(value>Integer.MAX_VALUE && negative_sign) {
                value = Integer.MIN_VALUE;
                break;
            }

        }

        return ret= (int) (negative_sign?value*-1:value);
    }
}
