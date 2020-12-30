import java.util.Scanner;

public class Base_Power_OfNumber_UsingLoop {
    /*
    * User entered Two numbers entered through the keyboard. Write a program to find the value of one number raised to the power of another. (Do not use Java built-in method)*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int base;
        int power;
        int result = 1;

        System.out.print("Enter a base number: ");
        base = input.nextInt();;

        System.out.print("Enter the Power of the Number: ");
        power = input.nextInt();

        for (int i = 1; i <+power ; i++) {
            result *= base;

        }
        System.out.println("Result: " + result);

    }
}
