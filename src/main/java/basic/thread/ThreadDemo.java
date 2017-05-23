package basic.thread;

/**
 * author: qiaohong.wang.
 * created on 2017/5/23.
 */
public class ThreadDemo extends Thread {
    private Thread t;
    private String threadName;

    public ThreadDemo(String name) {
        threadName = name;
        System.out.println("Creating" + threadName);
    }

    @Override public void run() {
        System.out.println("Running" + threadName);
        try {
            for (int i = 0; i <= 4; i++) {
                System.out.println("Thread:" + threadName + "," + i);
                Thread.sleep(30);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread" + threadName + "interrupted.");
        }
        System.out.println("Thread" + threadName + "exiting.");
    }

    @Override public synchronized void start() {
        System.out.println("Starting" + threadName);
        if (t == null) {
            t = new Thread(this, threadName);
            t.start();
        }
    }
}