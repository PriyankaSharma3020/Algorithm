package leetcode.array;

public class BuySellStock {
    public static void main(String[] args) {
        int res = BuySellStock.maxProfit(new int[]{7,1,5,3,6,4});
        System.out.println(res);
    }
    public static int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i =0;i<prices.length;i++)
        {
            if(prices[i]>max)
                max=prices[i];
            if(prices[i]<min)
                min=prices[i];

        }
        return max-min;
    }
}
