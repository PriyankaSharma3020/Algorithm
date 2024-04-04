package leetcode.linkedlist;

public class insterscetion {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode hA=headA;
        ListNode hB=headB;
        while(hA!=hB)
        {
            hA=hA.next;
            hB= hB.next;
            if(hA==null)hA=headB;
            if(hB==null)hB=headA;
        }
        if(hA==hB)
            return hA;
        return null;

    }
}
