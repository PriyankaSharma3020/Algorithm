package tree.again;

import java.util.HashMap;
import java.util.Stack;

public class NextGrtElem {
    public static void main(String[] args) {

    }
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> mp =nextGrtElem(nums2);
        for(int i=0;i<nums1.length;i++)
        {
            nums1[i]=mp.get(nums1[i]);
        }
        return nums1;
    }
    public HashMap<Integer,Integer> nextGrtElem(int[] arr)
    {
        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> hm  =new HashMap<>();
        for(int i =arr.length-1;i>=0;i--) {
            int val=-1;
            while(!st.isEmpty()) {
                if (arr[i] > st.peek())
                    st.pop();
                else {
                    val = st.peek();
                    break;
                }
            }
            hm.put(arr[i],val);

        }
        return hm;
    }
}
