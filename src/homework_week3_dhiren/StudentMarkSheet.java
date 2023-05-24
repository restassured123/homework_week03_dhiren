package homework_week3_dhiren;

import java.util.Scanner;

public class StudentMarkSheet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        m1(sc);
    }
        public   static  void m1(Scanner sc){
        // Input student details
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter roll number: ");
        int rollNo = sc.nextInt();

        // Input subject marks
        System.out.print("Enter Math marks: ");
        int mathMarks = sc.nextInt();
        System.out.print("Enter Science marks: ");
        int scienceMarks = sc.nextInt();
        System.out.print("Enter English marks: ");
        int englishMarks = sc.nextInt();

        // Validate marks range
        if (mathMarks < 0 || mathMarks > 100 || scienceMarks < 0 || scienceMarks > 100 || englishMarks < 0 || englishMarks > 100) {
            System.out.println("Invalid Input! Marks should be between 0 to 100.");
            //return;
        }

        // Calculate total and percentage
        int totalMarks = mathMarks + scienceMarks + englishMarks;
        double percentage = (totalMarks / 3.0);

        // Determine result and grade
        String result = (percentage >= 35) ? "Pass" : "Fail";
        String grade;
        if (percentage >= 80) {
            grade = "A+";
        } else if (percentage >= 60) {
            grade = "A";
        } else if (percentage >= 50) {
            grade = "B";
        } else {
            grade = "C";
        }

        // Print Mark Sheet
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                 MARK SHEET");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|Name: " + name);
        System.out.println("|Roll No: " + rollNo);
        System.out.println("|--------------------------------------------------|");
        System.out.println("|Subject        Marks");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|Math           " + mathMarks);
        System.out.println("|Science        " + scienceMarks);
        System.out.println("|English        " + englishMarks);
        System.out.println("|--------------------------------------------------|");
        System.out.println("|Total Marks: " + totalMarks);
        System.out.println("|Percentage: " + percentage);
        System.out.println("|Result: " + result);
        System.out.println("|Grade: " + grade);
        System.out.println("|--------------------------------------------------|");
    }
}



