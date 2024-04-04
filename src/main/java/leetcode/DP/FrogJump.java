package leetcode.DP;

public class FrogJump {
    public static void main(String[] args) {
      /*  int height[]={30,10,60,10,60,50};
        int n=height.length;
        int prev=0;
        int prev2=0;
        for(int i=1;i<n;i++){

            int jumpTwo = Integer.MAX_VALUE;
            int jumpOne= prev + Math.abs(height[i]-height[i-1]);
            if(i>1)
                jumpTwo = prev2 + Math.abs(height[i]-height[i-2]);

            int cur_i=Math.min(jumpOne, jumpTwo);
            prev2=prev;
            prev=cur_i;

        }
        System.out.println(prev);*/

        int height[]={30,10,60,10,60,50};
        int n=height.length;
        int prev2=Integer.MAX_VALUE;
        int prev1=Math.abs(height[1]-height[0]);
        for(int i=2;i<n;i++){

            int jumpOne= prev1 + Math.abs(height[i]-height[i-1]);
            int jumpTwo = prev2 + Math.abs(height[i]-height[i-2]);

            int cur_i=Math.min(jumpOne, jumpTwo);
            prev2=prev1;
            prev1=cur_i;

        }
        System.out.println(prev1);
    }
}
