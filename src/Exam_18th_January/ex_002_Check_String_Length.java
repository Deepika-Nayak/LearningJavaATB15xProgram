package Exam_18th_January;

import java.util.Scanner;
//Write a Java program to check whether the length of a given string is greater than 10 or not and print the result.
public class ex_002_Check_String_Length {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the String");
        String user_input = scanner.nextLine();
        int length_string=user_input.length();
        if(length_string>10){
            System.out.println("Length of the given string greater than 10");
        }
        else{

        System.out.println("Length of the given string is not greater than 10");
    }}
}
