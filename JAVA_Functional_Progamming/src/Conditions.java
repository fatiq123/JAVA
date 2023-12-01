import java.util.Scanner;

public class Conditions {
    public static void main(String[] args) {

        /*Scanner input = new Scanner(System.in);

        System.out.print("Enter you age: ");
        try {
            int age = input.nextInt();
            if (age >= 18) {
                System.out.println("You can vote");
            } else {
                System.out.println("You cannot vote");
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }*/

        calculator(60);

    }

    /*
       Write a Java program that takes a student's score as input and prints out the corresponding
       letter grade based on the following scale:
       A: 90-100
       B: 80-89
       C: 70-79
       D: 60-69
       F: 0-59
    */
    static void calculator(int score) {

        if (score >= 90 && score <= 100) {
            System.out.println("A Grade");
        } else if (score >= 80 && score <= 89) {
            System.out.println("B Grade");
        } else if (score >= 70 && score <= 79) {
            System.out.println("C Grade");
        } else if (score >= 60 && score <= 69) {
            System.out.println("D Grade");
        } else if (score >= 0 && score <= 59){
            System.out.println("F Grade");
        } else {
            System.out.println("Repeat the subject again");
        }
    }

}


