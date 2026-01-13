package ex_02_Java_Practice;

public class Lab_002_LeftTriangleStarPattern {
    static void main() {
        int n=6;
        for(int i=1;i<n;i++){
            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
