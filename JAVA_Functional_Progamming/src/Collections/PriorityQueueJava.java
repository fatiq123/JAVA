package Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueJava {
    public static void main(String[] args) {

  /* The PriorityQueue class implements the Queue interface. It holds the elements or objects which are to be
        processed by their priorities. PriorityQueue doesn't allow null values to be stored in the queue.*/

        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("Fatiq");
        queue.add("Ali");
        queue.add("Ahmed");

        System.out.println("head" + queue.element());
        System.out.println("head" + queue.peek());
        System.out.println("Iterate the queue elements");

        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }


        queue.remove();
        queue.poll();

        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }

    }
}
