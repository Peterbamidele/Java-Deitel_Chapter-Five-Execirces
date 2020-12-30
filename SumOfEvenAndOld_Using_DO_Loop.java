import javax.swing.*;
import java.util.Scanner;

public class SumOfEvenAndOld_Using_DO_Loop {
    /*A program that reads a set of integers,
    and then prints the sum of the even and odd integers.*/
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       int number;
        char choice;
        int evenSum = 0;
        int oddSum = 0;

        do {
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter the Number: " ));
//            System.out.print("Enter the Number: ");
            //number =input.nextInt();

            if (number % 2 == 0){
                evenSum += number;
            }
            else {
                oddSum +=number;
            }
//            System.out.print("Do you want to continue y/n?: ");
            choice = JOptionPane.showInputDialog("Do you want to Continue y/n?: ").charAt(0);
//            choice = input.next().charAt(0);

        }while (choice == 'y' || choice == 'Y');


        JOptionPane.showMessageDialog(null,"Sum of even Numbers: " + evenSum);
        JOptionPane.showMessageDialog(null,"Sum of old Numbers: " + oddSum);
//        System.out.println("Sum of even Numbers: " + evenSum);
//        System.out.println("Sum of old Numbers: " + oddSum);
    }
}
