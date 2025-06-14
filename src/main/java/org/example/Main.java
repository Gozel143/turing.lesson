package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a = 5.76675;
        long b = 7;
        int c = 3;
        double result = (a++) + (--b) - (++a) + (a += 3) + (++c);

        System.out.printf("%2.5f", result);


        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        int K = sc.nextByte();
        System.out.println(a < b ? "Fəxri" : a > b ? "Tural" : "Murad");

        double s = 32;
        char g = 's';
        System.out.println(s+g);



    }

}
