public class CalculatingTheNumberOfEvenIntegers {
     /*
    * (Calculating the number of Even Integers) Write an application that calculates the a
       of the odd integers from 1 to 15.*/
     public static void main(String[] args) {
         int counter;
         int product = 0;

         for ( counter = 0; counter <=20 ; counter+=2) {
             product += counter;
         }
         System.out.printf("The Product Of Even Number is : %d\n", product);
     }
}
