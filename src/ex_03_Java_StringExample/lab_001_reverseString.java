package ex_03_Java_StringExample;
import java.util.Scanner;

public class lab_001_reverseString {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string Input");
        String user_input= scanner.next();
        String reverse_word="";

        for(int i=user_input.length()-1; i>=0;i--){
            reverse_word=reverse_word+user_input.charAt(i);
        }
        System.out.println("Reverse of the user input :- " + reverse_word );

        //pallindrum

        if(user_input.equalsIgnoreCase(reverse_word)){
            System.out.println("Enter input is palindrom");
        }
        else{
            System.out.println("enterd input is not palindrom");
        }
    }
}
