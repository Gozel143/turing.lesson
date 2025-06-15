package org.example;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a month number");
        int a = scanner.nextInt();

        System.out.println(a < 1 ? "Wrong number, try again" : a < 2 ? "Winter" :
                a < 3 ? "Winter" : a < 4 ? " Winter" : a < 5 ? "Spring" : a < 6 ? "Spring" : a < 7 ?
                        "Spring" : a < 8 ? "Summer" : a < 9 ? "Summer" : a < 10 ? "Summer" : a < 11 ? "Autumn" :
                        a < 12 ? "Autumn" : a < 13 ? "Autumn" : "Wrong number try again");

    }


}
