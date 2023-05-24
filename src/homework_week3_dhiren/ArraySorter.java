package homework_week3_dhiren;

import java.util.Arrays;

public class ArraySorter {

        public static void main(String[] args) {
            // Numeric Array Sorting
            int[] numbers = {5, 2, 8, 1, 9, 3};
            System.out.println("Numeric Array before sorting: " + Arrays.toString(numbers));
            sortNumericArray(numbers);
            System.out.println("Numeric Array after sorting: " + Arrays.toString(numbers));

            // String Array Sorting
            String[] strings = {"orange", "apple", "banana", "grape", "kiwi"};
            System.out.println("String Array before sorting: " + Arrays.toString(strings));
            sortStringArray(strings);
            System.out.println("String Array after sorting: " + Arrays.toString(strings));
        }

        public static void sortNumericArray(int[] array) {
            Arrays.sort(array);
        }

        public static void sortStringArray(String[] array) {
            Arrays.sort(array);
        }
    }

