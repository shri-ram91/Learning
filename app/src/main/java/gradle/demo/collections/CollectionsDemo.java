package gradle.demo.collections;

import java.util.*;

public class CollectionsDemo {
    private List<String> fruits = new ArrayList<>();

    public void arrayList() {
        fruits.add("Apple");
        fruits.add("Grapes");
        fruits.add("Orange");
        fruits.add("Mango");
        System.out.println("You are inside Arraylist");
        System.out.println("******************************************************");
        System.out.println(fruits);
        System.out.println("******************************************************");
    }

    public void linkedList() {
        System.out.println("You are inside Linkedlist");
        System.out.println("******************************************************");
        LinkedList<String> ll = new LinkedList<String>();

        // Adding elements to the linked list
        ll.add("A");
        ll.add("B");
        ll.addLast("C");
        ll.addFirst("D");
        ll.add(2, "E");

        System.out.println(ll);

        ll.remove("B");
        ll.remove(3);
        ll.removeFirst();
        ll.removeLast();

        System.out.println(ll);
        System.out.println("******************************************************");
    }

    public void queue() {
        System.out.println("You are inside Queue");
        System.out.println("******************************************************");
        Queue<String> pq = new PriorityQueue<>();

        pq.add("Geeks");
        pq.add("For");
        pq.add("Geeks");

        System.out.println("Initial Queue " + pq);

        pq.remove("Geeks");

        System.out.println("After Remove " + pq);

        System.out.println("Poll Method " + pq.poll());

        System.out.println("Final Queue " + pq);
        System.out.println("******************************************************");
    }

    public void hashmap() {
        System.out.println("You are inside Hashmap");

        HashMap<String, String> map = new HashMap<>();

        // Adding elements to the Map
        // using standard put() method
        map.put("Spider Man ", "Marvel");
        map.put("Bat Man", "DC");
        map.put("Iron Man", "Marvel");

        // Print size and content of the Map
        System.out.println("Size of map is:- "
                + map.size());

        // Printing elements in object of Map
        System.out.println(map);

        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (map.containsKey("Iron Man")) {

            // Mapping
            String a = map.get("Iron Man");

            // Printing value for the corresponding key
            System.out.println("value for key"
                    + " \"Iron Man\" is:- " + a);
        }
        System.out.println("******************************************************");
    }
}
