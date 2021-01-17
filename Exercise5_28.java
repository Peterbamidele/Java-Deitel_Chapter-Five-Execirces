public class Exercise5_28 {
    /*
    * 5.28 Describe in general how you would remove any continue statement from a loop in a pro-
    gram and replace it with some structured equivalent. Use the technique you develop here to remove
    the continue statement from the program in Fig. 5.13.
    ANS: A loop can be rewritten without a continue statement by moving all the code that
    appears in the body of the loop after the continue statement to an if statement that
    tests for the opposite of the continue condition. Thus, the code that was originally
    after the continue statement executes only when the if statement’s conditional ex-
    pression is true (i.e., the “continue” condition is false). When the “continue” condi-
    tion is true, the body of the if does not execute and the program “continues” to the
    next iteration of the loop by not executing the remaining code in the loop’s body.*/
    public static void main(String[] args) {
            for ( int count = 1; count <= 10; count++ ) // loop of 10 times
                if ( count != 5 ) // if count is not 5
                    System.out.printf( "%d ", count ); // print
            System.out.println( "\nRemoved continue to skip printing 5" );
        }
    }


