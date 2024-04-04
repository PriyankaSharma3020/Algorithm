package leetcode.linkedlist;

public class ReverseLinkdlist {
    public static void main(String[] args) {

    }
    public ListNode reverseList(ListNode head) {
        if(head==null)
            return null;
        if(head.next==null)
            return head;

        ListNode prev =null;
        ListNode curr=head;
        ListNode next=head.next;
        while(next!=null)
        {
            curr.next=prev;
            prev=curr;
            curr=next;
            next=curr.next;

        }
        return curr;

    }
}
