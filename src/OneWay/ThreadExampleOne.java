package OneWay;

public class ThreadExampleOne extends Thread {
    //Need to override run method, in order to provide our own implementation.
    public void run(){
        System.out.println("ThreadExampleOne-> ThreadId: "+Thread.currentThread().getId());
//        System.out.println("ThreadExampleOne-> ThreadName: "+Thread.currentThread().getName());
//        System.out.println("ThreadExampleOne-> ThreadState: "+Thread.currentThread().getState());
//        System.out.println("-----------------------");

    }
}
