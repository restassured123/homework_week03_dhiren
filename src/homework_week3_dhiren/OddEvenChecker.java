package homework_week3_dhiren;


import java.util.Scanner;

public class OddEvenChecker {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println( "Enter a number :");
        int num = sc.nextInt();
        m1(num);
        sc.close();
    }
    public  static void  m1(int num){
        String result = (num % 2 == 0) ? "even" : "odd";
        System.out.println(num + " is " + result);

    }
}