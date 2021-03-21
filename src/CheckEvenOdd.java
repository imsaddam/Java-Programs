import java.util.Scanner;

public class CheckEvenOdd {

    public static void main(String[] args) {


        int number;
        System.out.println("Enter an integer number");

        // Take input from the terminal

        Scanner input = new Scanner(System.in);

        number = input.nextInt();

        // If the input number is divisible by 2 then its a even otherwise odd

        if( number % 2 == 0){
            System.out.println("The input number is an Even");
        }else {
            System.out.println("The input number is an Odd");
        }
    }


}
