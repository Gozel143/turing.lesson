package org.example;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please give a number between 1 and 5:");
        int a = scanner.nextInt();

        switch (a) {
            case 1:
                System.out.println("Chocolate Bar - $2.00");
                break;
            case 2:
                System.out.println("Soda - $1.50");
                break;
            case 3:
                System.out.println("Chips - $1.20");
                break;
            case 4:
                System.out.println("Sandwich - $3.00");
                break;
            case 5:
                System.out.println("Water - $1.00");
                break;
            default:
                System.out.println("Invalid selection. Please enter number between 1 and 5:");

        }

    }
}
