package Exam_11th_January;
import java.util.Scanner;
public class Exam_002_EvenOdd {
    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an integer number");

            while(!scanner.hasNextInt()){
                System.out.println("Enter an Integer number");
                scanner.next();
            }
            int number=scanner.nextInt();

            if(number!=0 && number!=1) {
                if (0 == (number%2)) {
                    System.out.println("Entered number is even:-" + number);
                } else {
                    System.out.println("Entered number is odd:-" + number);
                }
            }
            else{
                System.out.println("Entered number is a special number" + number);
            }

    }
}
