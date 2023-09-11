/*12.Write a program that executes two threads. One thread displays “Thread1” every 2,000 milliseconds, and the other displays “Thread2” every 4,000 milliseconds. Create the threads by extending the Thread class.*/
/*Author- Soumitra Das       Date-09/08/23*/


class Thread1 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread1");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

class Thread2 extends Thread {
    public void run() {
        while (true) {
            System.out.println("Thread2");
            try {
                Thread.sleep(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Threadclass {
    public static void main(String[] args) {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        
        thread1.start();
        thread2.start();
    }
}
