package leetcode.linkedlist;

public class DeleteNNodeFromEnd {

    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null)
            return null;

        //2 ptr approach
        ListNode dummyHead = new ListNode(0);
        dummyHead.next=head;
        //first move  the ptr1 by n nodes
        ListNode slow_ptr=dummyHead;
        ListNode fast_ptr=dummyHead;
        int move=n;
        while(move!=0&& fast_ptr!=null)
        {
            fast_ptr=fast_ptr.next;
            move--;
        }
        while(fast_ptr!=null &&fast_ptr.next!=null)
        {
            fast_ptr=fast_ptr.next;
            slow_ptr=slow_ptr.next;
        }
        //now replace
        //check for null
        if(slow_ptr.next!=null && slow_ptr.next.next!=null)
            slow_ptr.next=slow_ptr.next.next;

        return dummyHead.next;
    }
}
