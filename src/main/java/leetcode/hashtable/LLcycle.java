package leetcode.hashtable;

import java.util.List;

public class LLcycle {
    public static void main(String[] args) {

    }

    public boolean hasCycle(ListNode head) {

        ListNode slow=head;
        ListNode fast=head;
        do
        {
            if(fast==null||fast.next==null)
                break;
            if(slow==fast)
                return true;
            slow=slow.next;
            fast=fast.next.next;
        }while( slow!=fast);
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

