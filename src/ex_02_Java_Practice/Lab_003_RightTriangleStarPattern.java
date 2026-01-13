package ex_02_Java_Practice;

public class Lab_003_RightTriangleStarPattern {
    static void main() {

      for(int i=1;i<5;i++){
        int  j=i;
        do{
            System.out.print("* ");
            --j;
        }while(j>0);
          System.out.println();
      }

    }
}
