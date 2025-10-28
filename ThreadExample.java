class AscendingThread extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++)
            System.out.println("Thread 1: " + i);
    }
}

class DescendingRunnable implements Runnable {
    public void run() {
        for (int i = 10; i >= 1; i--)
            System.out.println("Thread 2: " + i);
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        new AscendingThread().start();
        new Thread(new DescendingRunnable()).start();
    }
}
