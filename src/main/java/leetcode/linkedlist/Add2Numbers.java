package leetcode.linkedlist;

public class Add2Numbers {
    public static void main(String[] args) {

    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if(l1==null)
            return l2;
        if(l2==null)
            return l1;
        //length check scneario
        ListNode a=l1;
        ListNode b=l2;

        ListNode res = new ListNode(0);
        ListNode returnList=res;
        int carry=0;
        boolean condition1= ((a!=null||b!=null)&&carry!=0);
        boolean condition2=(a!=null&& b!=null);
        while(condition2||condition1)
        {
            int val_b=b!=null?b.val:0;
            int val_a=a!=null?a.val:0;
            int val=val_a+val_b+carry;
            carry=val/10;
            val=val%10;
            res.next=new ListNode(val);
            res=res.next;
            a=a!=null?a.next:null;
            b=b!=null?b.next:null;
        }
        //check for carry
        if(a==null&&b!=null&&carry==0)
        {
            res=b;
        }
        else if(a!=null&&b==null&&carry==0)
        {
            res=a;
        }
        return returnList;
    }
}
