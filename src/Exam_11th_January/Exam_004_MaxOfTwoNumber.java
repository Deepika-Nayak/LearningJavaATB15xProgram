package Exam_11th_January;
import java.util.Scanner;
public class Exam_004_MaxOfTwoNumber {
    static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter an Integer number");
        while(!scanner.hasNextInt()){
            System.out.println("Enter input is text kindly enter two Valid integer");
            scanner.next();
        }
        int num1=scanner.nextInt();
        int num2=scanner.nextInt();
        String max_Number= num1 > num2 ? "num1 is maximum": "num2 is maximum";
        System.out.println(max_Number);

    }
}
