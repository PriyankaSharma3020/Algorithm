package stackQ;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class NextGreaterElem {
    public static void main(String[] args) {
        NextGreaterElem ne=new NextGreaterElem();
        int[] op = ne.nextGreaterElement(new int[]{4,1,2},new int[]{1,2,3,4});
        System.out.println(Arrays.toString(op));
    }

    /*
    st->
    1
    2
    3
    4
     */
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {

        Stack<Integer> st = new Stack<>();
        HashMap<Integer,Integer> mapping = new HashMap<>();
        int j =0;
        for(int i =nums2.length-1;i>=0;i--)
        {
            if(j==nums1.length)
                break;
            if(!st.isEmpty()){
                while(!st.isEmpty()&&(st.peek()<nums2[i]))
                    st.pop();
            }
            if(st.isEmpty())
                mapping.put(nums2[i],-1);
            else mapping.put(nums2[i],st.peek());

            st.push(nums2[i]);
        }
        int[] res = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            res[i] = mapping.get(nums1[i]);
        }

        return res;
    }
}
