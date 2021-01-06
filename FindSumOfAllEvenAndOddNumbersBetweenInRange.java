public class FindSumOfAllEvenAndOddNumbersBetweenInRange {
    /*
    * Find Sum of All Even and Odd Numbers Between Range, using While loop*/
    public static void main(String[] args) {
      int counter;
      int evenSum = 0;
      int oddSum = 0;

        for ( counter = 0; counter <=100 ; counter++) {
            if (counter%2==0)
            {
                evenSum = evenSum+counter;
            }
            else
            {
                oddSum= oddSum+counter;
            }

        }
        System.out.println("Sum of even numbers between 1 t0 100: " + evenSum);
        System.out.println("Sum of odd_numbers between 1 t0 100: " +  oddSum);

    }
}
