package leetcode.array;

public class MajorityElem {
    public static void main(String[] args) {
        //majorityElement(new int[]{})
    }
    public static int majorityElement(int[] nums) {
        int assume=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
                assume=nums[i];
            int i1 = nums[i] == assume ? (count++) : (count--);
        }
        return assume;
    }
}
