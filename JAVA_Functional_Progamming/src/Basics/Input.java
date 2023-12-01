package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String userName = input.nextLine();

        System.out.println("You entered: " + userName + "and length is: " + userName.length());

        if (userName.length() < 8) {
            System.out.println("Enter a new name: ");
            String newName = input.nextLine();
            System.out.println("You entered: " + newName);
        } else {
            System.out.println("Sorry you already have name greater then 8 characters");
        }
    }
}
