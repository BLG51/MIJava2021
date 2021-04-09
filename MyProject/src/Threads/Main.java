package Threads;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread();
        t1.start();
        Thread t2 = new MyThread();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("end");

        //        (new MyThread()).start();

////////////////////////////////////////

    }


    void adsad() {
        Runnable r = () -> {
            for (int i = 0; i < 1000; i++) {
                System.out.println(i);
            }
        };

        Thread thread1 = new Thread(r);
        thread1.start();
    }

}
