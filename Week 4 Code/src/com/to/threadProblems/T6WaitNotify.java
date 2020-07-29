package com.to.threadProblems;


public class T6WaitNotify {
    
    public static void main(String[] args) {
        ThreadB a = new ThreadB();
        a.start();
        synchronized(a){
            try{
                System.out.println("Waiting for second thread to complete...");
                a.wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            System.out.println("Total is: " + a.total);
            
            ThreadB b = new ThreadB();
            b.start();
            synchronized(b){
                try{
                    System.out.println("Waiting for second thread to complete...");
                    b.wait();
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                System.out.println("Total is: " + b.total);
            }
            
        }
    }
}
class ThreadB extends Thread{
    int total;
    @Override
    public void run(){
        synchronized(this){
            for(int i=0; i<10 ; i++){
                total += i;
            }
            notify();
            notifyAll();
        }
    }
}
