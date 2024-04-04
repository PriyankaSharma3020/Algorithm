package leetcode.array;

public class SingleNo {
    public static void main(String[] args) {
        singleNumber(new int[]{2,1,1});
    }
    public static int singleNumber(int[] nums) {
        int xor=0;
        for(int i =0;i<nums.length;i++)
        {
            xor^=nums[i];
        }
        System.out.println(xor);
        return xor;
    }
}
