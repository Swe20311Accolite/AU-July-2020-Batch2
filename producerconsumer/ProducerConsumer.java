package com.producerconsumer;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ProducerConsumer {

    public  static void main(String[] args)
    {
        Blockingqueue q=new Blockingqueue(5);
        ExecutorService es= Executors.newFixedThreadPool(2);
        es.execute(new producer(q));
        es.execute(new consumer(q));

        es.shutdown();
    }

}
