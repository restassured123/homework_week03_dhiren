package homework_week3_dhiren;

import java.util.Scanner;

public class ArithmeticCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        m1(sc);
    }

    public static void m1(Scanner sc){
        System.out.println( "Enter the first number: ");
        double num1 = sc.nextDouble();

        System.out.println("Enter the second number: ");
        double num2 = sc.nextDouble();

        System.out.println(" Enter the operator symbol (+, -, / ,*): ");
        char operator = sc.next().charAt(0);

        double result;
        if (operator=='+') {
            result = num1 + num2;
            System.out.println("addition: " + result);
        } else if ( operator=='-') {
            result = num1 - num2;
            System.out.println("Subtraction: " + result);
        }  else if (operator=='/') {
            if (num2 != 0) {
                result = num1 / num2;
                System.out.println("Division: " + result);
            } else {
                System.out.println("error: cannot divide by zero ");
            }
        } else if (operator=='*') {
            result =num1*num2;
            System.out.println( "Multiplication: "+ result);
        } else {
            System.out.println("Invalid operator symbol");
        }
    }
    }

