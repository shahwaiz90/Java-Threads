package SecondWay;

public class ThreadExampleSecond implements Runnable {
    //run() is a method in interface, it must be over-rided.

    public void run(){
//        System.out.println("ThreadExampleSecond-> ThreadState: "+Thread.currentThread().getState());
        System.out.println("ThreadExampleSecond-> ThreadId: "+Thread.currentThread().getId());
//        System.out.println("ThreadExampleSecond-> ThreadName: "+Thread.currentThread().getName());
//        System.out.println("-----------------------");

    }
}
