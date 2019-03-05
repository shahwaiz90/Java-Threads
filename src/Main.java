import OneWay.ThreadExampleOne;
import SecondWay.ThreadExampleSecond;

public class Main {

    public synchronized static void display(String thread){
        try {
            System.out.println("Displaying: "+thread);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        System.out.println("Main Thread Id: "+Thread.currentThread().getId());

//        Thread thread2 = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                for(int i=0; i < 5; i++) {
//                    display("thread2");
////                    System.out.println("ThreadExampleThree-> ThreadId: " + Thread.currentThread().getId());
////                    System.out.println("ThreadExampleThree-> ThreadName: " + Thread.currentThread().getName());
////                    System.out.println("ThreadExampleThree-> ThreadState: " + Thread.currentThread().getState());
//                }
//            }
//        });

//        thread2.start();

        //By just extending Thread class
        ThreadExampleOne threadExampleOne = new ThreadExampleOne();
        threadExampleOne.start();


        //By explicitly making a class
//        ThreadExampleSecond is of type Runnable. But who has the power to start it?? Ans: Thread!
        //So, we create Thread object to start the Runnable type of class.


        ThreadExampleSecond threadExampleSecond = new ThreadExampleSecond();
        Thread thread = new Thread(threadExampleSecond);
        thread.start();

        //        //By Making an Anonymous Class
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for(int i=0; i < 5; i++) {
//                    display("thread1");
//                    display("thread1");
                    System.out.println("ThreadExampleThree-> ThreadId: " + Thread.currentThread().getId());
//                    System.out.println("ThreadExampleThree-> ThreadName: " + Thread.currentThread().getName());
//                    System.out.println("ThreadExampleThree-> ThreadState: " + Thread.currentThread().getState());
                }
            }
        });

        thread1.start();

    }
}
