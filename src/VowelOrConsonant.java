import java.util.Scanner;

public class VowelOrConsonant {


    public static void main(String[] args) {


        boolean isVowel = false;
        Scanner input   = new Scanner(System.in);

        System.out.println("Enter a character");

        char ch = input.next().charAt(0);
        input.close();


        switch (ch){

            case 'a' :
            case 'e' :
            case 'i' :
            case 'o' :
            case 'u' :
            case 'A' :
            case 'E' :
            case 'I' :
            case 'O' :
            case 'U' : isVowel = true;
        }

        if(isVowel == true){
            System.out.println(ch+ " is a Vowel");
        }else {
            if(ch >= 'a'&&ch <= 'z' || ch >= 'A'&&ch <= 'Z'){
                System.out.println(ch+ " is a consonant");
            }else {
                System.out.println("The character is invalid");
            }
        }
    }


}
