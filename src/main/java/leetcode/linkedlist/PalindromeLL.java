package leetcode.linkedlist;

import java.util.List;

public class PalindromeLL {
    public static void main(String[] args) {

    }
    public boolean isPalindrome(ListNode head) {

        ListNode slow_ptr=head;
        ListNode fast_ptr=head;
        boolean isOdd=false;
        ListNode prev=head;
        while(fast_ptr!=null||fast_ptr.next!=null)
        {
            prev=slow_ptr;
            slow_ptr=slow_ptr.next;

            fast_ptr=fast_ptr.next.next;
        }
       ListNode startptr=fast_ptr==null?slow_ptr:slow_ptr.next;

       //reverse first half
        ListNode end_ptr=prev;
        ListNode reverese_prev=null;
        ListNode curr=head;
        ListNode next=head.next;
        while(curr!=end_ptr)
        {
            next=curr.next;
            curr.next=reverese_prev;
            reverese_prev=curr;
            curr=next;
        }
        ListNode a=reverese_prev;
        ListNode b=startptr;
        //compare 2 heads
        while(a!=null||b!=null)
        {
            if(a.val!=b.val)
                break;
            a=a.next;
            b=b.next;
        }
        if(a!=null||b!=null)
            return false;
        return true;

    }
}
