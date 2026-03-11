class EvenThread extends Thread {
    public void run() {
        System.out.println("Even Numbers:");
        for(int i=2;i<=10;i+=2) {
            System.out.println(i);
        }
    }
}

class OddThread extends Thread {
    public void run() {
        System.out.println("Odd Numbers:");
        for(int i=1;i<=10;i+=2) {
            System.out.println(i);
        }
    }
}

public class MultiThreading {
    public static void main(String[] args) {
        EvenThread t1 = new EvenThread();
        OddThread t2 = new OddThread();

        t1.start();
        t2.start();
    }
}
