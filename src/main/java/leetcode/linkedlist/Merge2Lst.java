package leetcode.linkedlist;

public class Merge2Lst {
    public static void main(String[] args) {

    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null)
            return list2;
        if(list2==null)
            return list1;
        ListNode returnHead=new ListNode(0);
        ListNode res=returnHead;
        ListNode a =list1;
        ListNode b = list2;
        while(a!=null && b!=null) {
            if(a.val>b.val){
            res.next = a;
            res = res.next;
            a = a.next;
        }else{
                res.next = b;
                res = res.next;
                b = b.next;
            }
        }
        if(a==null&&b!=null)
        {
            res.next=b;
        }else {
            res.next=a;
        }
        return returnHead.next;
    }
}
