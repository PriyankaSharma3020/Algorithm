package concurrency;

import java.util.*;

public class RunThreadsInOrder {
    public static void main(String[] args) throws InterruptedException {
        Thread t1=new Thread(()->{
            System.out.println("Thread 1 running startred");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 1 running ended");
        });

       // t1.join(); // this will only order the end of execution not the rder of running
        Thread t2=new Thread(()->{
            System.out.println("Thread 2 running startred");
            try {
                //Thread.sleep(5000);
                t1.join(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 2 running ended");
        });

        Thread t3=new Thread(()->{
            System.out.println("Thread 3 running startred");
            try {
                //Thread.sleep(5000);
                t2.join(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Thread 3 running ended");
        });
         List<String> l=new ArrayList<>();
        l.add("a");
        HashSet<String> s=new HashSet<>();
        s.add("a");
        s.contains("a");


        t3.start();
        t2.start();
        t1.start();
    }
}
