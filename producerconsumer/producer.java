package com.producerconsumer;


public class producer implements Runnable{
    Blockingqueue<Integer> q=null;
    int i=0;
    public producer(Blockingqueue<Integer> q){
        super(); this.q=q;
    }
    @Override
    public void run() {
        while(true){
            try{
                System.out.println("Producer produces" +i);
                q.put(i++);
                if(i==q.len) {
                    System.out.println("Queue is full");
                   Thread.sleep(200);
                    i=0;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

