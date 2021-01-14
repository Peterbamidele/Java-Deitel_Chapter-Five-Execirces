public class Exercise5_9 {
    /*
    Find and correct the error(s) in each of the following segments of code:
    a) For ( i = 100, i >= 1, i++ )
        System.out.println( i );

    ANS: The F in for should be lowercase. Semicolons should be used in the for header in-
    stead of commas. ++ should be --.**/

    public static void main(String[] args) {
        int i;
        for( i = 100; i >= 1; i--)
        System.out.println( i );
    }

   /* b) The following code should print whether integer value is odd or even:
            switch ( value % 2 ){
        case 0:
            System.out.println( "Even integer" );
             }
case 1:
        System.out.println( "Odd integer" );
    ANS: A break statement should be placed in case 0: .*/


}
