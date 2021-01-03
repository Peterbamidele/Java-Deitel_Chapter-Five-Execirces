import javax.swing.*;
import java.util.Scanner;

public class SumUp_Using_do_whle_loop {
    /*A do-while loop that asks the user to enter two numbers. The numbers should be added and the sum displayed. The loop should ask the user whether he or she wishes to perform the operation again.
    If so, the loop should repeat; otherwise it should terminate. */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number1, number2;
        char choice;

        do {
            number1 = Integer.parseInt(JOptionPane.showInputDialog("Enter the first Value: "));
            number2 = Integer.parseInt(JOptionPane.showInputDialog("Enter the Second Value: "));

            int sum  = number1 + number2;
            JOptionPane.showMessageDialog(null,"Sum of numbers: " + sum);

            choice = JOptionPane.showInputDialog("Do you want to continue y/n? ").charAt(0);
        }while (choice=='y' || choice == 'Y');

    }
}
