package Collections;

import java.util.Map;

public class Array {
    public static void main(String[] args) {

        int[] number = {1, 3, 5, 7, 9};
        int[][] arr = new int[10][20];
        arr[0][0] = 0;
        System.out.println(arr[0][0]);


        for (int n : number) {
            System.out.print(n);
        }

        for (int i = 0; i <= number.length; i++) {
            System.out.print("\n" + i);
        }

    }
}
