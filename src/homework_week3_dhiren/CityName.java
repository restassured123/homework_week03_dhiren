package homework_week3_dhiren;

import java.util.Scanner;

public class CityName {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m1(sc);
    }

    public static void m1(Scanner sc) {
        String alphabet = sc.nextLine().toUpperCase();
        String cityName;

        if (alphabet.equals("A")) {
            cityName = "Amsterdam";
        } else if (alphabet.equals("B")) {
            cityName = "Belgium";
        } else if (alphabet.equals("C")) {
            cityName = "Chelsea";
        } else if (alphabet.equals("D")) {
            cityName = "Delhi";
        } else if (alphabet.equals("E")) {
            cityName = "Egypt";
        } else if (alphabet.equals("F")) {
            cityName = "Florida";
        } else {
            cityName = "Invalid entry";
        }
        System.out.println("City Name: " + cityName);
        sc.close();
    }
}
