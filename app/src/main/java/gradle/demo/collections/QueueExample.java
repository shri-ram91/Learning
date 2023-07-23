package gradle.demo.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public Queue<Integer> pq = new PriorityQueue<>();

    public QueueExample() {
        for (int i = 0; i < 100; i++) {
            pq.add(i);
        }
    }

}
