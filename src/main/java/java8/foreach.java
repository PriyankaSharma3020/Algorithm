package java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class foreach {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) myList.add(i);

        //traversing using Iterator
        Iterator<Integer> it = myList.iterator();
        while(it.hasNext()){
            Integer i = it.next();
            System.out.println("Iterator Value::"+i);
        }

        myList.forEach(System.out::println);
        Integer.valueOf("abc");

    }
}

interface X{Iterable m(Iterable arg);}
class Y implements X{


    @Override
    public Iterable<Integer> m(Iterable arg) {
        return null;
    }
}
