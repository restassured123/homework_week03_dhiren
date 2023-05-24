package homework_week3_dhiren;

import java.util.Scanner;

public class ArrayContainsValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] numbers = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        System.out.print("Enter the value to search for: ");
        int value = scanner.nextInt();

        boolean containsValue = checkArrayContainsValue(numbers, value);
        if (containsValue) {
            System.out.println("The array contains the value " + value);
        } else {
            System.out.println("The array does not contain the value " + value);
        }
    }

    public static boolean checkArrayContainsValue(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
}