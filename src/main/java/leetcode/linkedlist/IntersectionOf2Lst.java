package leetcode.linkedlist;

public class IntersectionOf2Lst {
    public static void main(String[] args) {

    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {


        //find diff between length of both
        int diff = findDIff(headA,headB);

        //for the difference skip the bigger list
        ListNode intersect = skipBiggerListAndFindDiff(diff,headA,headB);

        //start traversing both together ,if same return intersection else zero
        return intersect;
    }

    private ListNode skipBiggerListAndFindDiff(int diff, ListNode headA, ListNode headB) {

        if(diff>0){
            while(diff!=0){
                diff--;
                headA=headA.next;
            }
        }else{
            while(diff!=0)
            {
                diff++;
                headB=headB.next;
            }
        }
        //find intersect now by proceeding both

        while(headA!=null)
        {
            if(headA==headB)
                return headA;
            headA=headA.next;
            headB=headB.next;
        }
        return new ListNode(0);
    }

    private int findDIff(ListNode headA, ListNode headB) {
        int lenA=0;
        int lenB=1;
        while(headA!=null && headB!=null)
        {
            //calculate together both
            if(headA!=null)
            {
                headA=headA.next;
                lenA++;
            }
            if(headB!=null)
            {
                headB=headB.next;
                lenB++;
            }
        }
        return lenA-lenB;
    }
}
