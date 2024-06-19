package thirdsem.thread.example;

import java.time.Duration;

public class ThreadExample extends Thread{
    
    @Override
    public void run(){
        System.out.println("Thread is running");
        System.out.println("Active Thread: " + Thread.currentThread().getName());
        System.out.println("Active Thread Priority Status: " + 
                Thread.currentThread().getPriority());
    }
    // currentThread() - this method returns the active thread running
    public static void main(String[] args) {
        ThreadExample t1 = new ThreadExample();
        // setting thread name
        t1.setName("Thread One");
        
        // setting thread priority
        t1.setPriority(MIN_PRIORITY);
        
        ThreadExample t2 = new ThreadExample();
        t2.setName("Thread Two");
        t2.setPriority(MAX_PRIORITY);
        
        // starting thread
        t1.start();
        t2.start();        
    }
}
