package leetcode.DP;

public class FrJmp {
    public static void main(String[] args) {
        FrJmp fr = new FrJmp();
       int r = fr.f(new int[]{30,10,60,10,60,50},5);
        System.out.println(r);
    }
    /*

     */
    int f(int[] arr, int n)
    {
       // if(n==0)return 0;
        int prev2=Integer.MAX_VALUE;
        int prev1=Math.abs(arr[1]-arr[0]);
        //if(n==1)return Math.abs(arr[1]-arr[0]);
        //if(n<0)return 0;
       // int one = Math.abs(arr[n]-arr[n-1])+f(arr,n-1);
        //int two = Math.abs(arr[n]-arr[n-2])+f(arr,n-2);
        //return Math.min(one,two);
        int curr=0;
        for(int i =2;i<n;i++)
        {
            int one=Math.abs(arr[i]-arr[i-1])+prev1;

            int two=Math.abs(arr[i]-arr[i-2])+prev2;
            curr=Math.min(one,two);
            prev2=prev1;
            prev1=curr;
        }
        return curr;
    }

}
