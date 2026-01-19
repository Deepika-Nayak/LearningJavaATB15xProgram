package ex_02_Java_Practice;

public class Lab_004_Count_vowels_and_consonants_in_a_String {
    static void main() {
        String s="Deepika";
        int cCount=0;
        int vCount=0;

        for (int i =0; i<s.length();i++){
            char ch=s.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vCount++;
            } else
            {
               cCount++ ;
            }
        }

        System.out.println("Number of consonants:- " +cCount+ " Number of vowels:- "+ vCount);

    }
    }

