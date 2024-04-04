package leetcode.hashtable;

import java.util.HashSet;
import java.util.Set;

public class LongestCOnsecutive {
    public static void main(String[] args) {
        LongestCOnsecutive l =new LongestCOnsecutive();
        System.out.println(l.longestConsecutiveS(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }
    public static int longestConsecutiveS(int[] nums){
        Set < Integer > hashSet = new HashSet< Integer > ();
        for(int num: nums) {
            hashSet.add(num);
        }
        int longestStreak=0;
        for(int num: nums) {
            if(!hashSet.contains(num - 1)) {
                int currentNum=num;
                int currentStreak=1;
                while(hashSet.contains(currentNum + 1)) {
                    currentNum += 1;
                    currentStreak += 1;
                }
                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }
        return longestStreak;
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i =0;i<nums.length;i++)
        {
            set.add(nums[i]);
        }
        int longestStreak=0;
        int currSTreak=1;
        for(int i =0;i<nums.length;i++) {
            int curr=nums[i];
            if (!(set.contains(curr - 1))) {
                currSTreak = 1;
                continue;
            }
            while (set.contains(--curr)) {
                currSTreak++;
            }
            longestStreak = Math.max(currSTreak, longestStreak);
        }
        return longestStreak;
    }
}
