package leetcode.bs;

public class RotatedSortedArr {
    public static void main(String[] args) {
        RotatedSortedArr rs = new RotatedSortedArr();
        int res = rs.search(new int[]{1},1);
        System.out.println(res);
    }
    public int search(int[] nums, int target) {
        //find the pivot
        int pivot=0;
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]<nums[i-1]) {
                pivot = i;
                break;
            }
        }
        //search in left
        int left = binarySearch(nums,0,pivot-1,target);
        //search in right
        if(left!=-1)
            return left;
        return binarySearch(nums,pivot,nums.length-1,target);
    }

    public int binarySearch(int[] arr,int low,int high,int target)
    {
        while(low<=high) {
            int mid = (low + high) / 2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }
    public int binarySearchHigh(int[] arr,int low,int high,int target)
    {
        while(low<=high) {
            int mid = (low + high) / 2;
            if(arr[mid]==target)
            {
                return mid;
            }
            else if(arr[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }
        return -1;
    }





}
