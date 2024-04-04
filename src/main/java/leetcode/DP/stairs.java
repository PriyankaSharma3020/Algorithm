package leetcode.DP;

import java.util.Arrays;

public class stairs {
    public static void main(String[] args) {
        stairs cs = new stairs();
        int[] arr= new int[6];
        Arrays.fill(arr,-1);
        System.out.println(cs.climb(5,arr));
    }

    public int climb1(int ind,int[] arr){
        if(ind==0)
            return 1 ;
        if(ind<0)
            return 0;
        if(arr[ind-1]!=-1)
            return arr[ind-1];
        int one=climb(ind-1,arr);
        int two=climb(ind-2,arr);
        return arr[ind-1]=one+two;
    }

    public int climb(int ind,int[] arr){

        arr[0]=1;
        arr[1]=1;
        for(int i =2;i<=ind;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        return arr[ind];
    }

    /*
    f(c)
    {
        if(c==0)return 1
        if(c<0)return 0
        int one=f(c-1)
        int two=f(c-2)
        return one+two;
    }
     */
}
