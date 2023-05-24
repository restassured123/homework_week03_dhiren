package homework_week3_dhiren;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.Scanner;

public class SalesCommission {
    public static void main(String[] args) {
        Scanner ac = new Scanner(System.in);
        m1(ac);
    }
      public static void m1(Scanner sc){
        System.out.println( "Enter the sales ID");
        int salesID = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter seller's name");
        String sellerName = sc.nextLine();

        System.out.println("Enter sales amount");
        double salesAmount = sc.nextDouble();

        System.out.println("Enter Basic salary");
        double basicSalary = sc.nextDouble();

        double commission;

        if (salesAmount >= 50000) {
            commission= 0.35* basicSalary;
        } else if (salesAmount >=30000 ) {
            commission = basicSalary * 0.20;
        } else if (salesAmount >=20000) {
            commission = basicSalary * 0.10;
        } else if ( salesAmount >=10000) {
            commission = basicSalary * 0.05;
        } else {
            commission = 0.02* salesAmount;
        }
        double totalSalary = basicSalary + commission;

        System.out.println("Sales ID " + salesID);
        System.out.println("Seller's Name " + sellerName);
        System.out.println("Sales Amount "+ salesAmount);
        System.out.println( "Basic Salary:"+ basicSalary);
        System.out.println( "Commission :" + commission);
        System.out.println( "Total salary : " + totalSalary);
        sc.close();
    }
}
