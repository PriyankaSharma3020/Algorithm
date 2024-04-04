package leetcode.hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOf2LinkedlIst {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode slow=headA;
        ListNode fast=headB;
        while(slow!=fast)
        {
            if(slow.next==null)
                slow.next=headB;
            if(fast==null)
                fast=headA;
            else if(fast.next==null)
                fast.next=headA;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(slow==fast)
            return slow;
        return null;
    }
    public ListNode getIntersectionNodeHM(ListNode headA, ListNode headB) {
        List<ListNode> lst = new ArrayList<>();
        ListNode sl  =headA;
        while(sl!=null)
        {
            lst.add(sl);
            sl=sl.next;
        }
        ListNode fl = headB;
        while(fl!=null)
        {
            if(lst.contains(fl))
                return fl;
            fl=fl.next;
        }
        return null;
    }
}




