package org.example;

import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please write a number:");
        int n = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println(n * i );

        }

        }
    }

