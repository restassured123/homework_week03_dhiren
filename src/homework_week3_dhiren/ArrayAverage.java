package homework_week3_dhiren;
import java.util.Scanner;


public class ArrayAverage {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter the size of the array: ");
            int size = sc.nextInt();

            int[] numbers = new int[size];

            System.out.println("Enter the elements of the array:");
            for (int i = 0; i < size; i++) {
                System.out.print("Element " + (i + 1) + ": ");
                numbers[i] = sc.nextInt();
            }

            double average = calculateAverage(numbers);
            System.out.println("Average of the array: " + average);
        }

        public static double calculateAverage(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return (double) sum / array.length;
        }
    }
