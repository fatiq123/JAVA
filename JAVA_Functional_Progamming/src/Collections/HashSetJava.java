package Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetJava {
    public static void main(String[] args) {

        /*
        * HashSet class implements Set Interface. It represents the collection that uses a hash table for storage.
        *  Hashing is used to store the elements in the HashSet. It contains unique items.
        * */

        HashSet<String> set = new HashSet<>();
        set.add("Fatiq");
        set.add("Ali");
        set.add("Ahmed");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
