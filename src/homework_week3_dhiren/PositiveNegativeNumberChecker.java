package homework_week3_dhiren;

import java.util.Scanner;

public class PositiveNegativeNumberChecker {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number: ");
        int number = sc.nextInt();
        check(number);

    }


    public static void check(int number) {
        if (number > 0)
        {
            System.out.println("Number is Positive: ");
        } else if (number<0) {
            System.out.println("Number is Negative: ");
        }else {
            System.out.println("Number is Zero: ");
        }
    }
}
