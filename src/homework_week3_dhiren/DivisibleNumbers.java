package homework_week3_dhiren;

import java.util.Scanner;

public class DivisibleNumbers {

    public static void main(String[] args) {
        System.out.println("Numbers divisible by 3:");
        printNumbersDivisibleBy3();

        System.out.println("\nNumbers divisible by 5:");
        printNumbersDivisibleBy5();
    }

    public static void printNumbersDivisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void printNumbersDivisibleBy5() {
        for (int i = 1; i <= 100; i++) {
            if (i % 5 == 0) {
                System.out.print(i + " ");
            }
        }
    }
}


