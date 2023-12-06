package Encapsulation;

import java.util.Scanner;

public class Encapsulation {

    Scanner input = new Scanner(System.in);
    private int deposit_money;


    int calculate() {
        return this.deposit_money;
    }

    void depositMoney(int salary) {
        System.out.print("Enter the salary you want to deposit ");
        salary = Integer.parseInt(input.nextLine());
        if (salary < 0) {
            System.out.println("Amount cannot be negative");
            return;
        }
        this.deposit_money = salary;
    }


    public static void main(String[] args) {
        Encapsulation e = new Encapsulation();
        e.depositMoney(5000);
        int total = e.calculate();
        System.out.println("Total income is " + total);
    }
}
