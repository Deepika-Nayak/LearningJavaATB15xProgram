package Exam_18th_January;

import java.util.Scanner;

public class ex_005_Reverse_a_String {
    static void main() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string Input");
        String user_input= scanner.next();
        String reverse_word="";

        for(int i=user_input.length()-1; i>=0;i--){
            reverse_word=reverse_word+user_input.charAt(i);
        }
        System.out.println("Reverse of the user input :- " + reverse_word );

    }
}
