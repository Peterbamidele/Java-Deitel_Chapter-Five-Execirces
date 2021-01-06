public class CalculatingTheProductOfOddIntegers_5_12 {
    /*
    * (Calculating the Product of Odd Integers) Write an application that calculates the product
       of the odd integers from 1 to 15.*/
    public static void main(String[] args) {
        int counter;
        int product = 1;

        for (counter = 1; counter <=15 ; counter+=2) {
//            if (counter % 2 !=0)
                product *= counter;
        }
        System.out.printf("The Product Of Odd Numbers 1-15 : %d\n", product);
    }

}
