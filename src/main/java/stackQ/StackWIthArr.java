package stackQ;

public class StackWIthArr {
    public static void main(String[] args) {

    }

    //push(): Insert the element in the stack.
    //
    //pop(): Remove and return the topmost element of the stack.
    //
    //top(): Return the topmost element of the stack
    //
    //size(): Return the number of remaining elements in the stack.

    int[] stack;
    int cap_filled=0;

    StackWIthArr(int size)
    {
        stack=new int[size];

    }

    boolean push(int elem)
    {
       // if(stack.isFull())
         //   return false;
        stack[cap_filled++]=elem;
        return true;
    }

    int pop(int elem)
    {
       // if(!stack.isEmpty())
         //   return stack[cap_filled--];
        return -1;
    }



}
