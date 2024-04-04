package leetcode.array;

public class TwoSum {
    public static void main(String[] args) {

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int m =1;
        int nn =(-1*n)+1;
        ListNode curr=head;
        ListNode prev=null;
        ListNode ret=null;
        if(curr==null)
            return null;
        while( curr.next!=null)
        {
            if(m==n)
                break;
            if(nn==0&&prev==null) {
                prev = head;
                ret=prev;
            }
            else if (prev!=null) {
               prev=prev.next;
            }
            curr=curr.next;
            m++;
            nn++;

        }
        if( prev!=null)
        {
            prev.next=curr;
        } else if (prev==null && curr!=null) {
            ret=curr.next;
        }
        return ret;
    }
}

 class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
