package ex_02_Java_Practice;
import java.util.Scanner;
public class Lab_002_LeapYearcheck {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Year");
        int year=scanner.nextInt();

        if((year%4==0 && year%100!=0) || (year%400==0)){

                System.out.println("Given year is a Leap Year "+ year);


        }
        else{
            System.out.println("Given year is not a Leap Year "+ year);
        }
    }
}
