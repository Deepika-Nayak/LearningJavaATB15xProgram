package Exam_18th_January;

import java.util.Scanner;

public class ex_004_CompareTwoStrings {
    //Write a Java program to compare two strings and check whether they are equal or not.
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String user_input1 = scanner.nextLine();
        System.out.println("Enter the String");
        String user_input2 = scanner.nextLine();

        if(user_input1.equalsIgnoreCase(user_input2)){
            System.out.println("Given string equal");
        }
        else{
            System.out.println("Given string not equal");
        }
    }
}
