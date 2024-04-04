package leetcode.hasmap;

public class HappyNo {
    public static void main(String[] args) {

    }
    public boolean isHappy(int n) {
        int sq=0;
        //find a cycle
        int slow=findSqOFDigits(n);
        int fast= findSqOFDigits(findSqOFDigits(n));
        while(slow!=fast&&fast!=1)
        {
             slow=findSqOFDigits(n);
             fast= findSqOFDigits(findSqOFDigits(n));
        }
        if(fast==1)
            return true;
        return false;
    }

    private int findSqOFDigits(int n) {

        int sq=0;
        while(n>0)
        {
           int digit=n%10;
           n =n/10;
           sq+=digit*digit;
        }
        return sq;
    }
}
