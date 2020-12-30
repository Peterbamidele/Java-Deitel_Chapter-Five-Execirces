import java.util.Scanner;
/* A program that prompts the user to input a positive integer. It should then print the multiplication table of that number. */

public class PostiveInterMultiplicatio {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num;

        System.out.print("Enter any positive integer: ");
        num = input.nextInt();

        System.out.println("Multiplication Table of " + num);

        for (int i = 1; i <=20; i++) {
            System.out.println(num +" x " + i + " = " + (num*i) );

        }
    }
}
