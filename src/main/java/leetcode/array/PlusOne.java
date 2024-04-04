package leetcode.array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne po =new PlusOne();
        int[] res = po.plusOne(new int[]{9});
        System.out.println(Arrays.toString(res));
    }
    public int[] plusOne(int[] digits) {

        boolean carry=false;
        for(int i=digits.length-1;i>=0;i--)
        {
            if(digits[i]==9){
                digits[i]=0;
                carry=true;
            }
            else{
                digits[i]=digits[i]+1;
                carry=false;
                break;
            }
        }
        int[] res =digits;
        if(digits[0]==0 && carry) {
            res = new int[digits.length+1];
            res[0]=1;
        }
        return res;
    }
}
