package stackQ;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingSingleQ {

    public static void main(String[] args) {
        stack s = new stack();
        s.push(3);
        s.push(2);
        s.push(4);
        s.push(1);
        System.out.println("Top of the stack: " + s.top());
        System.out.println("Size of the stack before removing element: " + s.size());
        System.out.println("The deleted element is: " + s.pop());
        System.out.println("Top of the stack after removing element: " + s.top());
        System.out.println("Size of the stack after removing element: " + s.size());
    }
}
    class stack{
    Queue<Integer> q = new LinkedList<>();
/*st-> 1234->4321        q->
                            1
        4                   2
        3                   3
        2                   4
        1    */
        int size() {
            return q.size();
        }
    void push(int elem){
       q.add(elem);
        System.out.println("adding elem "+elem);
        for(int n=0;n< (q.size()-1);n++)
        {
            System.out.println("inside for loop ,calling add for elem removed:"+q.peek());
            q.add(q.remove());

        }

        //TC O(n)
    }

    int pop(){
        return q.remove();
    }

    int top(){
        return q.peek();
    }
}
