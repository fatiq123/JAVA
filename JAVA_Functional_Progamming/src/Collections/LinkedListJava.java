package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListJava {
    public static void main(String[] args) {

        /*
        * LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
        * It can store the duplicate elements. It maintains the insertion order and is not synchronized.
        * In LinkedList, the manipulation is fast because no shifting is required.
        * */

        LinkedList<String> list = new LinkedList<>();
        list.add("Fatiq");
        list.add("Ali");
        list.add("Atif");
        list.add("Aslam");

        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
