/*13.Write a program that executes two threads. One thread will print the even numbers and the another thread will print odd numbers from 1 to50.*/
/*Author- Soumitra Das       Date-09/08/23*/


class EvenThread extends Thread {
    public void run() {
        for (int i = 2; i <= 50; i += 2) {
            System.out.println("Even: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
		  //System.out.println(e);

            }
        }
    }
}

class OddThread extends Thread {
    public void run() {
        for (int i = 1; i <= 50; i += 2) {
            System.out.println("Odd: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            //System.out.println(e);

            }
        }
    }
}

public class EvenOdd {
    public static void main(String[] args) {
        EvenThread et = new EvenThread();
        OddThread ot = new OddThread();

        et.start();
        ot.start();
    }
}
