package leetcode.hashtable;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSUm {
    public static void main(String[] args) {
        TwoSUm ts = new TwoSUm();
        ts.twoSum(new int[]{2,7,11,15},9);
    }

    public int[] twoSum(int[] nums, int target) {
        int[] ret=new int[2];
        Arrays.fill(ret,-1);
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i =0;i<nums.length;)
        {
            if(hm.containsKey(nums[i]))
            {
                ret[0]=i;
                ret[1]=hm.get(nums[i]);
                return ret;
            }
            i++;
            hm.put(target-nums[i],i);
        }
        return ret;
    }
}
