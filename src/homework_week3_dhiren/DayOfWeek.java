package homework_week3_dhiren;

import java.util.Scanner;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        //Create scanner object
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number between 1 to 7 : ");
        int num = sc.nextInt();
        m1(num);
    }

    public static void m1(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Week Contains 1 to 7 Days.");
        }
    }
}