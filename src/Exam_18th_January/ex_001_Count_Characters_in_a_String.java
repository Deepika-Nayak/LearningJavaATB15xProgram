package Exam_18th_January;

import java.util.Scanner;

public class ex_001_Count_Characters_in_a_String {
    static void main() {
        //Write a Java program to count the total number of characters in a given string (excluding spaces).
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string Input");
        String user_input= scanner.nextLine();
        int count=0;

        for(int i=0;i<user_input.length();i++){
           char c= user_input.charAt(i);
            String str = Character.toString(c);
          if(!str.contains(" ")){
               count++;
            }


        }
        System.out.println("length of the given input:- "+ count);
    }
}
