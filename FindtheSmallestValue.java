import java.util.Scanner;

public class FindtheSmallestValue {
/*
* 5.11 (Find the Smallest Value) Write an application that finds the smallest of several integers.
Assume that the first value read specifies the number of values to input from the user.*/
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int smallest = 0;
    int number ; //number by user
    int integers; //number or how many  integers the use want


    System.out.print("Enter number of Integers: ");
    integers = input.nextInt();

    for (int counter = 1; counter <=integers ; counter++) {

        System.out.print("Enter integer : ");
        number = input.nextInt();

        if (counter == 1)
            smallest = number;
        else
            if (number < smallest ) // set the smallest  to number
            smallest = number;

    }

    System.out.printf("Smallest Integer is : %d\n", smallest);
    // the result will prompt out still it got a number that can be divided by 1

    }
}
