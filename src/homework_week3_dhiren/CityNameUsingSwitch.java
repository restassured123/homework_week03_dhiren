package homework_week3_dhiren;

import java.util.Scanner;

public class CityNameUsingSwitch {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter an alphabet (A-F): ");
        String alphabet = sc.nextLine().toUpperCase();
        printCityName (alphabet);
    }

    public  static  void printCityName(String alphabet){
        switch (alphabet) {
            case "A":
                System.out.println("City: Amsterdam");
                break;
            case "B":
                System.out.println("City: Berlin");
                break;
            case "C":
                System.out.println("City: Copenhagen");
                break;
            case "D":
                System.out.println("City: Dublin");
                break;
            case "E":
                System.out.println("City: Edinburgh");
                break;
            case "F":
                System.out.println("City: Florence");
                break;
            default:
                System.out.println("Invalid entry");
                break;
        }


    }
}
