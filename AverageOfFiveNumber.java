import java.util.Scanner;

public class AverageOfFiveNumber {
    // Progarm to print Average of five number
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int n = 0,count,sum;
        float avg;
        sum = 0;

        System.out.print("Enter the number: ");
        n = input.nextInt();

        for (count = 0; count < 5; count++) {

            System.out.printf("%d " ,n);
            sum = sum + n;
        }
        avg= sum/5;
        System.out.printf("The Average is: %f",avg);

        
    }
}

