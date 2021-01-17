import java.util.Scanner;

public class Exercise5_11 {
    /*
    * 5.11 Write an application that finds the smallest of several integers. Assume that the first value
read specifies the number of values to input from the user.*/
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        int smallest = 0; // smallest number
        int number = 0; // number entered by user
        int integers; // number of integers
        System.out.print( "Enter number of integers: " );
        integers = input.nextInt();
        for ( int counter = 1; counter <= integers; counter++ )
        {
            System.out.print( "Enter integer: " );
            number = input.nextInt();
            if ( counter == 1 )
                smallest = number;
            else if ( number < smallest )
                smallest = number;
        }
        System.out.printf( "Smallest Integer is: %d\n", smallest );
    }
}
