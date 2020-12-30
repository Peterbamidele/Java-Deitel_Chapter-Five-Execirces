import java.util.Scanner;

public class FactorialValue_Using_forloop {
    // A program to find the factorial value of any number entered through the keyboard.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        int fact =1;

        System.out.print("Enter any positive Integer: ");
        num = input.nextInt();

        for (int i = 1; i <=num ; i++) {
            fact *=i;

        }
        System.out.println("Factorial: " + fact);


    }

}
