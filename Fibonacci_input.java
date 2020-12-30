import javax.swing.*;
import java.util.Scanner;

public class Fibonacci_input {
    /*Write a program to print Fibonacci series of n terms where n is input by user :
0 1 1 2 3 5 8 13 24 ..... */
     //The Fibonacci sequence is a series of numbers where a number is the addition of the last two numbers, starting with 0, and 1.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        int firstTerm = 0,
        secondTerm = 1,
                thirdTerm;


        number = Integer.parseInt(JOptionPane.showInputDialog("Enter number of term of series: "));

        JOptionPane.showInputDialog(firstTerm + " " + secondTerm + " ");

        for (int i = 3; i <= 

                number ; i++) {
            thirdTerm = firstTerm + secondTerm;
            JOptionPane.showMessageDialog(null,thirdTerm + " ");
          firstTerm = secondTerm;
          secondTerm = thirdTerm;
        }

    }
}
