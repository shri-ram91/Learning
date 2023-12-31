/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.demo;

import gradle.demo.collections.CollectionsDemo;
import gradle.demo.collections.QueueExample;
import gradle.demo.threads.ThreadExample;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        CollectionsDemo demo = new CollectionsDemo();
        demo.arrayList();
        demo.linkedList();
        demo.queue();
        demo.hashmap();

        QueueExample queueExample = new QueueExample();
        Thread t1 = new ThreadExample(queueExample.pq);
        //t1.run();
        Thread t2 = new ThreadExample(queueExample.pq);
        //t2.run();
        while (!queueExample.pq.isEmpty()) {
            try {
                t1.run();
                t2.run();
            } catch (Exception ex) {
                System.err.println(ex);
            }

        }
    }
}
