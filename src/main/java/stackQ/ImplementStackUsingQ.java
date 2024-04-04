package stackQ;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQ {
    public static void main(String[] args) {

    }

    //using single Q


}
class stk{
    Queue<Integer> q = new LinkedList();
    void push(int elem)
    {
        q.add(elem);
        for(int i =0;i<q.size()-1;i++)
        {
            q.add(q.remove());
        }
    }

    int pop(){
        return q.peek();

    }



}
