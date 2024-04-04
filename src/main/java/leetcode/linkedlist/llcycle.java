package leetcode.linkedlist;

public class llcycle {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        if(head==null)return false;
        ListNode slow=head;
        ListNode fast=head.next;
        while(fast!=null&&slow!=fast)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow==fast)
            return true;
        return false;
    }
}
