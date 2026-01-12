package ex_01_Java_Basics;

import java.util.Scanner;

public class Lab008_GradeCalculatorUsingdoWhileLoop
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kindly enter your score:");
        int score;

        do {

            while(!scanner.hasNextInt())
            {
                System.out.println("Please Enter a Integer score");
                scanner.next();
            }
            score= scanner.nextInt();
            if (score<0 || score>100)
            {
                System.out.println("Enter a positive number between 0-100");
            }

        } while (score<0 || score>100);
        {
            if (score >= 90) {
                System.out.println("Grade is :- A");
            } else if (score >= 80) {
                System.out.println("Grade is :- B");
            } else if (score >= 70) {
                System.out.println("Grade is :- C");
            } else if (score >= 60) {
                System.out.println("Grade is :- D");
            } else
            {
                System.out.println("Grade is :- F");
            }
        }
    }
}
