package Collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetJava {
    public static void main(String[] args) {

        /*
        * Java TreeSet class implements the Set interface that uses a tree for storage.
        * Like HashSet, TreeSet also contains unique elements.
        * However, the access and retrieval time of TreeSet is quite fast. The elements in TreeSet stored in ascending order.
        * */

        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("Fatiq");
        treeSet.add("Ali");
        treeSet.add("Ahmed");

        Iterator<String> itr = treeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
