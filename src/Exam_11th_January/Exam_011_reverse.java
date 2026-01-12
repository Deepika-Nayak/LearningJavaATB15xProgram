package Exam_11th_January;

public class Exam_011_reverse {
    static void main() {
        int num=123;
        int reverse_number=0;
         do {
             int value = num % 10;
             reverse_number=reverse_number*10;
             reverse_number=reverse_number+value;
             num=num/10;

         }while(num!=0);
        System.out.println(reverse_number);

}}
