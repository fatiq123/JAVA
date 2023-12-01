package Basics;

public class Loops {
    public static void main(String[] args) {

//        int i = 0;
//        while (i < 5) {
//            System.out.println(i);
//            i++;
//        }


//        do {
//            i++;
//        } while (i < 3); {
//            System.out.println(i);
//        }
//



//        // for loop
//        for (int k = 0; k < 5; k++) {
//            System.out.print("k"+ k);
//            for (int j = 0; j < 5; j++) {
//                System.out.print("j" + j);
//            }
//        }




//        for (int i = 1; i<= 2; i++) {
//            System.out.print(i);
//            for (int j = 1; j <= 3; j++) {
//                System.out.print(j);
//            }
//        }


//        // Break Statement
//        for (int m = 1; m<= 2; m++) {
//            System.out.println("m = " + m);
//            if (m == 2) {
//                break;
//            }
//            System.out.println("m1 = " + m);
//        }


//        // Continue Statement
//        for (int n = 1; n<=3; n++) {
//            System.out.println("n = " + n);
//            if (n == 2) {
//                continue;
//            }
//            System.out.println("n1 = " + n);
//        }



        int k = 0;
        while (k < 5) {
            if (k == 3) {
                break;
            }
            k++;
            System.out.println(k);
        }

    }
}
