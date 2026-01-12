package ex_01_Java_Basics;

public class Lab003_Operator {
    public static void  main(String[] args) {
       /*  int a = 10;
        a = a++ + a++ + a++;
        System.out.println(a);*/

        int a = 3;
        int b = a++ * ++a;
        System.out.println(b);
        int a1 = 5;
        System.out.println(a1++ + a1--);


    }
}
