package com.producerconsumer;

public class consumer implements Runnable{
    Blockingqueue<Integer> q=null;
    int i=0;
    public consumer(Blockingqueue<Integer> q){
        super(); this.q =q;
    }
    @Override
    public void run() {
        while(true){
            try{
                System.out.println("Consumer consumes" +q.take());
                i++;
                if(i==q.len) {
                    System.out.println("Queue is empty");
                    Thread.sleep(200);
                    i=0;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}