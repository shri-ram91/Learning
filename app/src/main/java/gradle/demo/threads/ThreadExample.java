package gradle.demo.threads;

import java.util.Queue;

public class ThreadExample extends Thread {
    private Queue<Integer> pq;

    public ThreadExample(Queue<Integer> pq) {
        this.pq = pq;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " got the number " + this.pq.poll() + " From the queue");
    }
}
