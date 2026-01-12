package Exam_11th_January;
import java.util.Scanner;
public class Exam_005 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an Integer");

        while (!scanner.hasNextInt()) {
            System.out.println("Enter an Integer only");
            scanner.next();
        }
        int num = scanner.nextInt();

        String result= (num> 0)? "+ve":( (num == 0)? "zero":"-ve");
        System.out.println("Entered number " +num+ " is a " +result);

    }
}
