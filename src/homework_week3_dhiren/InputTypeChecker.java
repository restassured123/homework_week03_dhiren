package homework_week3_dhiren;

import java.util.Scanner;

public class InputTypeChecker {

    public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter a value: ");
            char input = sc.next().charAt(0);

            String result = checkInputType(input);
            System.out.println(result);
        }

        public static String checkInputType(char input) {
            if (Character.isDigit(input)) {
                return "Input is a number.";
            } else if (Character.isLetter(input)) {
                return "Input is an alphabet.";
            } else {
                return "Input is a symbol.";
            }
        }
    }

