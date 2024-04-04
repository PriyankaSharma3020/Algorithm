package slidingWindow;

public class rds {
    public static void main(String[] args) {

    }
    public int removeDuplicates(int[] nums) {
       int j =1;
       int count=0;
       for(int i =1;i<nums.length;i++)
       {
           if(nums[i]==nums[i-1])
           {
               count++;
           }else{
               count=1;
           }
           if(count<=2)
           {
               nums[j++]=nums[i];
           }
       }
       return j;
    }
}
