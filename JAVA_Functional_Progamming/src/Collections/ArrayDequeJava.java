package Collections;

import java.util.ArrayDeque;

public class ArrayDequeJava {
    public static void main(String[] args) {

       /* ArrayDeque class implements the Deque interface. It facilitates us to use the Deque. Unlike queue,
        we can add or delete the elements from both the ends.
        ArrayDeque is faster than ArrayList and Stack and has no capacity restrictions.*/

        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.add("Fatiq");
        deque.add("ALi");
        deque.add("Ahmed");

        for (String elements: deque) {
            System.out.println(elements);
        }
    }
}
