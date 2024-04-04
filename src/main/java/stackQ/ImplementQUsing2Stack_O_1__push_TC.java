package stackQ;

import java.util.Stack;

public class ImplementQUsing2Stack_O_1__push_TC {
    public static void main(String args[]) {
        Q q = new Q();
        q.push(3);
        q.push(4);
        System.out.println("The element poped is " + q.pop());
        q.push(5);
        System.out.println("The top element is " + q.peek());
        System.out.println("The size of the queue is " + q.size());

    }
}

class Q{

    Stack<Integer> st_input = new Stack();
    Stack<Integer> st_output = new Stack();

    int size() {
        return (st_input.size() + st_output.size());
    }
    int pop()
    {

        if(st_output.isEmpty()) {
            while(!st_input.isEmpty())
            { st_output.push(st_input.pop());}
        }
        return st_output.pop();
    }
    int peek()
    {

        if(st_output.isEmpty()) {
            while(!st_input.isEmpty())
            { st_output.push(st_input.pop());}
        }
        return st_output.peek();
    }

     void push(int x) {
        System.out.println("The element pushed is " + x);
        st_input.push(x);
    }
}


//q using 2 stacks
class QWith2Stk{
    Stack<Integer> input_stk= new Stack<>();
    Stack<Integer> output_stk= new Stack<>();

    public void push(int x) {

        input_stk.push(x);
    }

    public int pop() {
        if(output_stk.isEmpty())
        {
            while(!input_stk.isEmpty()){
                output_stk.push(input_stk.pop());
            }

        }
        return output_stk.pop();
    }

    public int peek() {
        if(output_stk.isEmpty())
        {
            while(!input_stk.isEmpty()){
                output_stk.push(input_stk.pop());
            }

        }
        return  output_stk.peek();
    }

    public boolean empty() {
        if(output_stk.isEmpty()&&input_stk.isEmpty())
            return true;
        return false;
    }

}