import java.util.Scanner;

public class Sales5_17 {
    /*A mail-order house sells five products whose retail prices are as follows: product 1, $2.98;
    product 2, $4.50; product 3, $9.98; product 4, $4.49 and product 5, $6.87. Write an application
    that reads a series of pairs of numbers as follows:
    a) product number
    b) quantity sold
    Your program should use a switch statement to determine the retail price for each product. It
    should calculate and display the total retail value of all products sold. Use a sentinel-controlled
    loop to determine when the program should stop looping and display the final results.*/
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in );
        double product1 = 0;
        double product2 = 0;
        double product3 = 0;
        double  product4 = 0;
        double  product5 = 0;

        int productId = 1; // current product id number

        while ( productId != 0 ) // ask user for product number until value entered
        {
            System.out.print(
                    "Enter product number (1-5) (0 to stop): " );
            productId = input.nextInt();
            if ( productId >= 1 && productId <= 5 )
            {System.out.print( "Enter quantity sold: " );
                int quantity = input.nextInt();
                
    // increment the total for the item by the price times the quantity sold
                switch ( productId )
                {
                    case 1:
                        product1 += quantity * 2.98;
                        break;
                    case 2:
                        product2 += quantity * 4.50;
                        break;
                    case 3:
                        product3 += quantity * 9.98;
                        break;
                    case 4:
                        product4 += quantity * 4.49;
                        break;
                    case 5:
                        product5 += quantity * 6.87;
                        break;
                }            } 
            else if ( productId != 0 )
                System.out.println("Product number must be between 1 and 5 or 0 to stop" );
        }

        System.out.println();
        System.out.printf("Product 1:$%.2f\n",product1 );
        System.out.printf("Product 2:$%.2f\n",product2 );
        System.out.printf("Product 3:$%.2f\n",product3 );
        System.out.printf("Product 4:$%.2f\n",product4 );
        System.out.printf("Product 5:$%.2f\n",product5 );

    }
}

