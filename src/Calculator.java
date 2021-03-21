import java.util.Scanner;

public class Calculator {


    public static void main(String[] args) {

        // Take two input from terminal
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");

        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.println("Enter an operator (+, -, *, /)");

        char operator = reader.next().charAt(0);
        double result;

        // switch case for each operation

        switch (operator){

            case '+' :
                result = first + second;
                break;
            case '-' :
                result = first - second;
                break;
            case '*' :
                result = first * second;
                break;
            case '/' :
                result = first / second;
                break;

            default:
                System.out.println("Error. The operator is not correct");
                return;

        }
        //print the operation output
        System.out.printf("%.1f %c %.1f = %.1f", first,operator, second, result);



    }

}
