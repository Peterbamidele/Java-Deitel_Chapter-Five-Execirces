import javax.swing.*;
import java.util.Scanner;

public class HCF_using_do_whle {
    //Write a program to calculate HCF of Two given number.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int dividend, divisor;
        int remainder, hcf =0;


        dividend = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number: "));

        divisor = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number: "));

            do {
                remainder = dividend % divisor;

                if (remainder == 0)
                {
                    hcf = divisor;
                }
                else
                {
                    dividend = divisor;
                    divisor = remainder;
                }
            }while (remainder !=0);

            JOptionPane.showMessageDialog(null,"HCF: " + hcf);
    }
}
