package stackQ;

public class QusingArr {
    public static void main(String[] args) {

    }

    int[] q=new int[10000];
    int size=0;
    int max=10000;
    int start=-1;
    int end=-1;

    void push(int elem)
    {
        //check if full

        if(this.size==max)
            System.out.println("Already full");
        //check if empty to khol khata
        if(end==-1) {
            start = 0;
        }
        q[end]=elem;


        //enter element

        //increase size
        size++;
        //increase end by rotating
        end =(end+1)%max;
    }

    int pop() throws Exception {

        return -1;

    }




}
