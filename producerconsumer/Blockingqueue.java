package com.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Blockingqueue<Integer> {
        Queue<Integer> q=new LinkedList<Integer>();
        int len;
        public Blockingqueue(int len){
            this.len=len;
        }
        public synchronized void put(Integer a) throws InterruptedException{
           while(q.size()==len)
           {
               wait();
           }
           if(q.isEmpty())
           {
               notifyAll();
           }
            q.add(a);
        }
        public synchronized Integer take() throws InterruptedException{
            while (q.isEmpty()){
                wait();
            }
            if(q.size()==len){
                notifyAll();
            }
            return q.remove();
        }

}
