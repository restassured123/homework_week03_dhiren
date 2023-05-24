package homework_week3_dhiren;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any year :");
        int y = sc.nextInt();
        m1(y);
    }
    public static void  m1(int y){
        if (y % 100 == 0 && y % 400 == 0 || y % 100 != 0 && y % 4 == 0) {
            System.out.println(y + "is a Leap year ");
        } else {
            System.out.println(y + ": Is Not a Leap year ");
        }
    }
}