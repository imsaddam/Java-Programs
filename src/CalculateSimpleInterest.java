import java.util.Scanner;

public class CalculateSimpleInterest {


    public static void main(String[] args) {


        float principal, interestRate, time, simpleInterest;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter Principal Amount: ");
        principal = input.nextFloat();

        System.out.println(" Enter Rate of the interest : ");
        interestRate = input.nextFloat();

        System.out.println(" Enter the time period: ");
        time = input.nextFloat();

        input.close();

        simpleInterest = (principal * interestRate * time)/100;
        System.out.println("The simple interest is : " +simpleInterest);

    }
}
