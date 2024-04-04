package leetcode.linkedlist;

import java.util.HashMap;

public class CopyListRandomPtr {
    public static void main(String[] args) {

    }
        public Node copyRandomList(Node head) {

          HashMap<Node,Node> nodeMapping=new HashMap<>();
          Node new_curr=new Node(head.val);
            Node new_head=new_curr;
          Node curr=head;
            nodeMapping.put(curr,new_curr);
          int index=0;
          while(curr!=null)
          {
              //set random
              setRandom(nodeMapping, new_curr, curr);
              //setNext
              setNext(nodeMapping, new_curr, curr);
              curr=curr.next;
              new_curr=new_curr.next;
          }
          return new_head;

        }

    private static void setNext(HashMap<Node, Node> nodeMapping, Node new_curr, Node curr) {
        Node new_next_node=null;
        Node curr_next= curr.next;
        if(curr_next!=null)
        {
            if(nodeMapping.containsKey(curr_next))
            {
                new_next_node = nodeMapping.get(curr_next);
            }else{
                new_next_node=new Node(curr_next.val);
                nodeMapping.put(curr_next,new_next_node);
            }
        }
        new_curr.next=new_next_node;
    }

    private static void setRandom(HashMap<Node, Node> nodeMapping, Node new_curr, Node curr) {
        Node curr_random= curr.random;
        Node new_random_node=null;
        if(curr_random!=null){
            if (!nodeMapping.containsKey(curr.random)) {
                new_random_node = new Node(curr_random.val);
                //making new random node ,setting val,not setting next and random for it
                nodeMapping.put(curr_random, new_random_node);
            } else {
                new_random_node = nodeMapping.get(curr.random);
            }
        }
        new_curr.random=new_random_node;
    }
}
    class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
            this.next = null;
            this.random = null;
        }
    }
