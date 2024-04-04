package leetcode.linkedlist;

public class cycle {
    public static void main(String[] args) {

    }
    public boolean hasCycle(ListNode head) {
        if(head==null)
            return false;
        ListNode slow_ptr=head;
        ListNode fast_ptr=head;

        while(head!=null && head.next!=null)
        {
            if(slow_ptr==fast_ptr)
                return true;
            slow_ptr=slow_ptr.next;
            fast_ptr=fast_ptr.next.next;

        }
        return false;
    }
}
class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
  }
