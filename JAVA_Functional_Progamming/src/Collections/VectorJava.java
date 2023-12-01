package Collections;

import java.util.Iterator;
import java.util.Vector;

public class VectorJava {
    public static void main(String[] args) {

    /* Vector uses a dynamic array to store the data elements. It is similar to ArrayList.
        However, It is synchronized and contains many methods that are not the part of Collection framework.*/

        Vector<String> v = new Vector<>();

        v.add("Fatiq");
        v.add("ali");
        v.add("ahmed");

        Iterator itr = v.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }

}
