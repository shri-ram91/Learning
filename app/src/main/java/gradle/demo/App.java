/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package gradle.demo;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
        CollectionsDemo demo=new CollectionsDemo();
        demo.arrayList();
        demo.linkedList();
        demo.queue();
        demo.hashmap();
    }
}
