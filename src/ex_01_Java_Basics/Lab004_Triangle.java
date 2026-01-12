package ex_01_Java_Basics;

import java.util.Scanner;

public class Lab004_Triangle {
    public static void main(String[] args){
        Scanner scanner= new Scanner (System.in);

        System.out.println("enter the first side of the Triangle");
        int s1=scanner.nextInt();
        System.out.println("enter the second side of the Triangle");
        int s2=scanner.nextInt();
        System.out.println("Enter the 3rd side of the Triangle");
        int s3=scanner.nextInt();

        if (s1==s2 && s2==s3){
            System.out.println("Triangle is equilateral");
        }
        else if(s1==s2 || s2==s3){
            System.out.println("Triangle is isosceles");

        }
        else{
            System.out.println("Triangle is ");
        }
      scanner.close();
    }
}
