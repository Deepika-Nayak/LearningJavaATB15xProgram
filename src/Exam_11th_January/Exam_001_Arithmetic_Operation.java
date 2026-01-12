package Exam_11th_January;

import java.util.Scanner;

public class Exam_001_Arithmetic_Operation {
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 2 Integer number");
        while(!scanner.hasNextInt()){
            System.out.println("Given input is a Text kindly enter ywo integer");
            scanner.next();
        }
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println("Addition of two numbers:- "+ (num1+num2));
        System.out.println("Difference of two numbers:- "+ (num1-num2));
        System.out.println("Multiplication of two numbers:- "+ (num1*num2));
        if (num2==0) {
            System.out.println("Division and remainer can't be performed as n2 is zero ");

        }
        else{
            System.out.println("Division of two numbers:- " + (num1 / num2));
            System.out.println("Remainder of two numbers:- " + (num1 % num2));
        }
    scanner.close();
    }
}
