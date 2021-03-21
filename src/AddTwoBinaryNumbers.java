import java.util.Scanner;

public class AddTwoBinaryNumbers {

    public static void main(String[] args) {

        // Two variables to hold binary values
        long binary1, binary2;
        int i = 0, carry = 0;

        int[] sum = new int[10];

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first binary number: ");
        binary1 = input.nextLong();

        System.out.println("Enter the second binary number: ");
        binary2 = input.nextLong();
        input.close();

        while (binary1 != 0 || binary2 != 0){

            sum[i++] = (int)((binary1 % 10 + binary2 % 10 + carry)%2);
            carry = (int)((binary1 % 10 + binary2 % 10 + carry)/2);

            binary1 = binary1 / 10;
            binary2 = binary2 / 10;


        }
        if(carry != 0){
            sum[i++] = carry;

        }
        --i;
        System.out.println("Output: ");
        while (i >= 0){
            System.out.print(sum[i--]);
        }
        System.out.println("\n");



    }
}


