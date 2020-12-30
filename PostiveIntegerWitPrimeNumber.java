import javax.swing.*;
import java.util.Scanner;

public class PostiveIntegerWitPrimeNumber {
    /*
    * A program that prompts the user to input a positive integer. It should then output a message indicating
    * whether the number is a prime number. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter the positive Number"));
//        System.out.print("Enter the positive integer");
//        number = input.nextInt();

        boolean gland = true;

        for (int i = 2; i <number ; i++) {
            if (number % i == 0)
            {
                gland = false;
                break;
            }

        }
        if (gland && number > 1)
        {
//            System.out.println("Number is Prime");
            JOptionPane.showMessageDialog(null,"Number is Prime");
        }
        else
        {
//            System.out.println("Number is not prime");
            JOptionPane.showMessageDialog( null, "Number is not prime");
        }

    }
}
