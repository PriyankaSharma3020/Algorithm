package leetcode.hashtable;

public class HappyNo {
    public static void main(String[] args) {

    }
    public boolean isHappy(int n) {
        int no =n;
        long slow=n;
        long fast=sqOfDigits(n);
        while(fast!=1&&(slow!=fast))
        {
            slow = sqOfDigits(n);
            fast=sqOfDigits(sqOfDigits(n));
        }
        if(fast==1)
            return true;
        return false;

    }

    private int sqOfDigits(int n) {
        int sq=0;
        int digit=0;
        while(n>0) {
            digit = n % 10;
            n = n / 10;
            sq += digit * digit;
        }
        return -1;
    }
}
