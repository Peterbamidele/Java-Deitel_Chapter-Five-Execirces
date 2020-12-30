import javax.swing.*;

public class RandomGuess {
    /*
    * Write a program that generates a random number and asks the user to guess what the number is.
    * If the user's guess is higher than the random number, the program should display "Too high, try again."
    * If the user's guess is lower than the random number, the program should display "Too low, try again."
    * The program should use a loop that repeats until the user correctly guesses the random number.*/
    public static void main(String[] args) {
        int number;
        int guess;
        int tries = 0; // to hold number of tries

        number = (int) (Math.random() * 100) + 1; // to get random

        JOptionPane.showInputDialog("Enter guess between 1 and 100: ");
        System.out.println();
        do {
            guess = Integer.parseInt(JOptionPane.showInputDialog("Enter a guess between 1 and 100 : "));
            tries++;

            if(guess > number)
            {
                JOptionPane.showMessageDialog(null,"Too high! Try Aain");
            }
            else if(guess < number )
            {
                JOptionPane.showMessageDialog(null,"Too low! Try Again");
            }
            else
                {
                JOptionPane.showMessageDialog(null,"Correct! You got it in" + tries + guess);
            }
        }while (guess !=number);
    }
}
