package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListJava {
    public static void main(String[] args) {

        /*
        * The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element
        * of different data types. The ArrayList class maintains the insertion order and is non-synchronized.
        * The elements stored in the ArrayList class can be randomly accessed.
        * */
        ArrayList<String> list = new ArrayList();
        list.add("Fatiq");
        list.add("Ali");
        list.add("Atif");
        list.add("Aslam");

//        // iterating through list
//        for (String s : list) {
//            System.out.println(s);
//        }
        Iterator<String> itr = list.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

    }
}
