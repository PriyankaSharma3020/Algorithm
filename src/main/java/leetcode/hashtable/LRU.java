package leetcode.hashtable;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LRU {
    public static void main(String[] args) {

    }


}
class Node {
    Node prev, next;
    int key, value;
    Node(int _key, int _value) {
        key = _key;
        value = _value;
    }
}
class LRUCache{

    Queue<Integer> st = new LinkedList<>();
    Node head = new Node(0, 0), tail = new Node(0, 0);
    HashMap<Integer,Integer> mp  =new HashMap<>();
    int cap=0;
    int size;
    public LRUCache(int capacity) {
        this.size=capacity;
    }

    public int get(int key) {
        if(mp.containsKey(key))
        {
            //update stack
            st.remove(key);
            st.add(key);
            //return val
            return mp.get(key);
        }
        return -1;
    }

    public void put(int key, int value) {
            //put in map and queuue
        if(cap==size)
        {
            //evict LRU
           int k= st.poll();
           mp.remove(k);
        }
        cap++;
        mp.put(key,value);
        if(st.contains(key))
        {
            st.remove(key);

        }
        st.add(key);
    }
}
