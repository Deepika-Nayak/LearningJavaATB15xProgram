/*Question :-
        Write a program that calculates and displays the letter grade for a given numerical score (e.g., A, B, C, D, or F) based on the following grading scale:




        A: 90-100

        B: 80-89

        C: 70-79

        D: 60-69

        F: 0-59

        code:-*/
package ex_01_Java_Basics;
import java.util.Scanner;
public class Lab0006_GradeCalculator
{
    public static void main(String[] args)
    {
        Scanner scanner= new Scanner (System.in);
        System.out.println("Kindly enter your score:- ");
        if (scanner.hasNextInt()) {

            int Score = scanner.nextInt();
            if (Score >= 0 && Score <= 100)
            {

                if (Score >= 90) {
                    System.out.println("Grade is :- A");
                } else if (Score >= 80) {
                    System.out.println("Grade is :- B");
                } else if (Score >= 70) {
                    System.out.println("Grade is :- C");
                } else if (Score >= 60) {
                    System.out.println("Grade is :- D");
                } else
                {
                    System.out.println("Grade is :- F");
                }
            }
            else
            {
                System.out.println("Kindly enter a +ve number between 0 to 100");
            }
        }

        else{
            System.out.println("Kindly enter an integer");
        }

        scanner.close();
    }
}