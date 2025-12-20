package Practical;

import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        int marks = scanner.nextInt();
        String grade = "";
        String description = "";
        if (marks>=0 && marks<=40) {
            grade = "F";
            description = "Fail";
        } else if (marks>=41 && marks<=49) {
            grade = "F+";
            description = "Marginal Fail";
        }else if (marks>=50 && marks<=54) {
            grade = "D";
            description = "Pass";
        }else if (marks>=55 && marks<64) {
            grade = "C";
            description = "Pass";
        }else if (marks>=65 && marks<=69) {
            grade = "B";
            description = "Credit";
        }else if (marks>=70 && marks<=74) {
            grade = "B+";
            description = "Credit";
        }else if (marks>=75 && marks<=79) {
            grade = "A";
            description = "Disrinction";
        }else if (marks>=80 && marks<=100) {
            grade = "A+";
            description = "Distinction";
        }
        System.out.printf("Grade: %s\n%s",grade,description);
    }
}
