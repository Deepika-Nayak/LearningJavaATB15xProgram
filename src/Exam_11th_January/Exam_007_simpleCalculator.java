package Exam_11th_January;
import java.util.Scanner;
public class Exam_007_simpleCalculator {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        while(!scanner.hasNextInt())
        {
            System.out.println("Given input is a Text, Kindly enter two Integer value");
            scanner.next();
        }
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        System.out.println("Enter the action you want to perform with the 2 number Addition, multiplication, division");
        String calculator =scanner.next().toLowerCase();

        switch (calculator) {
            case "addition":
                System.out.println(num1+num2);
                break;
            case "substraction":
                System.out.println(num1-num2);
                break;
            case "multiplication":
                System.out.println(num1*num2);
                break;

            case "division":
                System.out.println(num1/num2);
                 break;
            default:
                System.out.println("You have not entered the correct option");
        }
    }
}
