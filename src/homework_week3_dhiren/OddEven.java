package homework_week3_dhiren;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m1(sc);
    }


    public static void m1(Scanner sc) {
        System.out.println("Enter any number");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println(num + " is an even number.");
        } else {
            System.out.println(num + " is an odd number.");
        }
        sc.close();
    }
}
