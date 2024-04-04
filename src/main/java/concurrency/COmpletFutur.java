package concurrency;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.*;
import java.util.stream.IntStream;

interface abc{
    static void print(){
        System.out.println("abc");
    };
}
public class COmpletFutur implements abc {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        abc.print();

        CompletableFuture<Integer> future=CompletableFuture.supplyAsync(()->{
           return 12/0;
        }).thenApplyAsync((x)->{return x/2;}).exceptionally(x-> 0);

        Integer res = future.get();
        System.out.println(res);
        BlockingQueue bq=new LinkedBlockingQueue();
        bq.put(1);
        SharedObject obj = new SharedObject();
        ExecutorService svc = Executors.newFixedThreadPool(10);
        IntStream.range(1,100).forEach(x->svc.submit(obj::calculate));
        svc.awaitTermination(1000, TimeUnit.MILLISECONDS);
        System.out.println(obj.getSum());
        ThreadLocalEg eg = new ThreadLocalEg();
        Thread t  =new Thread(eg );
        Thread t2  =new Thread(eg );
        Thread t3  =new Thread(eg );
        t.start();
        t2.start();
        t3.start();

        Set<Integer> st = new HashSet<>();


    }



}
class ThreadLocalEg implements Runnable{
    private static final ThreadLocal<Integer> myVal=new ThreadLocal<>(){
        @Override
        protected Integer initialValue() {
            return 1;
        }
    };

    @Override
    public void run() {
        System.out.println("Thread name is"+Thread.currentThread().getName()+"Myval is:"+myVal.get());
        myVal.set(2);
        System.out.println("Thread name is"+Thread.currentThread().getName()+"Myval is now:"+myVal.get());
    }
}
class SharedObject {//implements Runnable{
    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    private int sum=0;
    public void calculate(){
        setSum(getSum() + 1);
    }


}
