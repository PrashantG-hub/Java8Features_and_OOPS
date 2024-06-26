public class MultiThreadingUsingThread {

    public static void main(String[] args) {

        MyThread_1 obj1 = new MyThread_1();
        MyThread_2 obj2 = new MyThread_2();

        obj1.start();
        obj2.show();
    }}
    class MyThread_1 extends Thread {
        public void run() {
            System.out.println("Thread 1 is running");
        }
    }

    class MyThread_2 extends Thread {
        public void show() {

            System.out.println("Thread 2  is running");
        }
    }



