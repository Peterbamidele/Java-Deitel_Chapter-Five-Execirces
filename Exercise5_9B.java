public class Exercise5_9B<value> {
    /*
    /* b) The following code should print whether integer value is odd or even:
            switch ( value % 2 ){
        case 0:
            System.out.println( "Even integer" );
             }
        case 1:
        System.out.println( "Odd integer" );
        ANS: A break statement should be placed in case 0: .*/

    public static void main(String[] args) {
        int value = 8;
        switch (value % 2)
        {
            case 0:
                System.out.println("Even Integer");
                break;
            case 1:
                System.out.println("Odd integer");
        }




    }

   }
