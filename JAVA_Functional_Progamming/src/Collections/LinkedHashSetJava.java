package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetJava {
    public static void main(String[] args) {

        /*
        * LinkedHashSet class represents the LinkedList implementation of Set Interface.
        * It extends the HashSet class and implements Set interface. Like HashSet, It also contains unique elements.
        *  It maintains the insertion order and permits null elements.
        * */

        LinkedHashSet<String> set = new LinkedHashSet<>();
        set.add("Fatiq");
        set.add("Ali");
        set.add("Ahmed");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
