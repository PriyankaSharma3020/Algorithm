package leetcode.hashtable;

import java.util.HashMap;

public class LRUCacheTCOn {
    public static void main(String[] args) {

    }


}
class MyNode{

    MyNode prev,next;
    int val;
    int key;
    MyNode(int key,int val)
    {
        this.val=val;
        this.key=key;
    }

}
class LRUCache1 {
    MyNode head=new MyNode(0,0);
    MyNode tail=new MyNode(0,0);

    HashMap<Integer,MyNode> hm=new HashMap<>();
    int cap =0;
    int size;
    public LRUCache1(int capacity) {
        this.size=capacity;
        head.next=tail;
    }

    public int get(int key) {
        //get the key
        if(!hm.containsKey(key))
            return -1;
        MyNode mn = hm.get(key);
        //remove node
        removeMyNode(mn);
        //add in beginning
        addMyNode(mn);
        return mn.val;
    }

    private void addMyNode(MyNode mn) {
        if(mn==null)
            return;
        MyNode prev=head.next;
        head.next=mn;
        mn.next=prev;
        cap++;
    }

    private void removeMyNode(MyNode myNode) {
        MyNode prev=myNode.prev;
        prev.next=myNode.next;
        MyNode next = myNode.next;
        next.prev=prev;
        cap--;
        hm.remove(myNode.key);
    }

    public void put(int key, int value) {
        //if cap full then eject last used from tail
        if(cap==size)
        {
            removeMyNode(tail.prev);
        }
        MyNode prev = head.next;
        MyNode mn =new MyNode(key,value);
        head.next=mn;
        mn.prev=head;
        prev.prev=mn;
        mn.next=prev;
        hm.put(key,mn);
    }
}
