package homework_week3_dhiren;

import java.time.Month;
import java.time.Year;

public class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else {
            return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 && year % 100 == 0;
        }
    }
    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else {
            switch (month) {
                case 2:
                    return isLeapYear(year) ? 29 : 28;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                default:
                    return 31;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600)); //false
        System.out.println(isLeapYear(1600));  //true
        System.out.println(isLeapYear(2017));  //false
        System.out.println(isLeapYear(2000));  // true

        System.out.println(getDaysInMonth(1, 2020));   //31
        System.out.println(getDaysInMonth(2, 2020));   //29
        System.out.println(getDaysInMonth(2, 2018));   //28
        System.out.println(getDaysInMonth(-1, 2020));  //-1
        System.out.println(getDaysInMonth(1, -2020));  //-1
    }
}
