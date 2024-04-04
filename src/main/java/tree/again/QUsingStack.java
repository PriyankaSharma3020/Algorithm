package tree.again;

import java.util.Stack;

public class QUsingStack {
    Stack< Integer > input = new Stack < > ();
    Stack < Integer > output = new Stack < > ();

    public static void main(String[] args) {

    }
    public void push(int x) {
        while(!input.isEmpty())
        {
            output.push(input.pop());
        }
        input.push(x);
        while(!output.isEmpty())
        {
            input.push(output.pop());
        }
    }

    public int pop() {
        if(input.isEmpty())
            return -1;
        return input.pop();
    }

    public int peek() {
        if(input.isEmpty())
            return -1;
        return input.peek();
    }

    public boolean empty() {
        return input.size()==0;
    }



}
