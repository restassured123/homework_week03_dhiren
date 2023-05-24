package homework_week3_dhiren;

import java.util.Scanner;

public class SalarySlip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m1(sc);
    }

    public  static void m1(Scanner sc){

                                                //Input employee details
        System.out.println("Enter Employee ID: ");
        int employeeID = sc.nextInt();
        sc.nextLine();                         // Consume the newline character

        System.out.println("Enter Employee Name: ");
        String employeeName = sc.nextLine();
        System.out.println("Enter Basic Salary: ");
        double basicSalary = sc.nextDouble();

                                            //calculate allowances and deductions
        double hra = 0.1 * basicSalary;
        double ta =  0.08 * basicSalary;
        double da = 0.09* basicSalary;
        double pf = 0.2 *basicSalary;

                                              // calculate gross salary
        double grossSalary = basicSalary + hra+ ta + da - pf;
                                                // print salary slip
        System.out.println("|-------------------------------------|");
        System.out.println("| Salary Slip ------------------------|");
        System.out.println("|-------------------------------------|");
        System.out.println("| Employee ID    :" + employeeID+    "|");
        System.out.println("| Employee Name  :" + employeeName + "|");
        System.out.println("|-------------------------------------|");
        System.out.println("| Basic Salary   :" + basicSalary+ "  |");
        System.out.println("| HRA  10%       :" + hra + "         |");
        System.out.println("|TA 8%           :" + ta +  "         |");
        System.out.println("|DA 9%           :" + da +  "         |");
        System.out.println("|PF -20%         :" + pf +  "         |");
        System.out.println("|-------------------------------------|");
        System.out.println("| Gross Salary   :"  + grossSalary +" |");
        System.out.println(" |=====================================");
        sc.close();
    }
}
