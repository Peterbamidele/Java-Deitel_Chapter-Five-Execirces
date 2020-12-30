import javax.swing.*;
import java.util.Scanner;

public class Largest_Smallest_Using_doWhileLoop {
    /*Write a program to enter the numbers till the user wants and at the end the program should display the
    largest and smallest numbers entered.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        char choice;

        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));

            if (number > max){
                max = number;
            }
            if(number < min){
                min = number;
            }
            choice = JOptionPane.showInputDialog("Do you want to continue y/n? ").charAt(0);

        }while (choice=='y' || choice == 'Y');

        JOptionPane.showMessageDialog(null,"Largest Number: " + max);
        JOptionPane.showMessageDialog(null,"Smallest Number: " + min);
    }

    }
