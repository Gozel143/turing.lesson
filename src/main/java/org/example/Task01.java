package org.example;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give me your exam score:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if (a < 40 || b < 40 || c < 40) {
            System.out.println("Failed - One or more exam scores are too low.");

        } else if (a >= 85 && b >= 85 && c >= 85) {
            System.out.println("Congratulations! You have earned a Certificate of\n" +
                    "Excellence.");

        } else if (a >= 70 && a < 85 && b >= 70 && b < 85 && c >= 70 && c < 85) {
            System.out.println("Well done! You have earned a Certificate of Achievement.");

        } else if (a >= 50 && a < 70 && b >= 50 && b < 70 && c >= 50 && c < 70) {
            System.out.println("You passed.");
        } else {
            System.out.println("Failed.");
        }
    }
}
