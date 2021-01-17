public class Exercises5_27 {
    /*
    * 5.27
What does the following program segment do?
for (i = 1; i <= 5; i++)
{
for (j = 1; j <= 3; j++)
{
for (k = 1; k <= 4; k++)
System.out.print('*');
System.out.println();
} // end inner for
System.out.println();
}*/
    public static void main(String[] args) {
        {
            int i;
            int j;
            int k;
            for ( i = 1; i <= 5; i++ )
            {
                for ( j = 1; j <= 3; j++ )
                {
                    for ( k = 1; k <= 4; k++ )

                        System.out.print( '*' );

                    System.out.println();
                } // ending of the inner for
                System.out.println();
            } // end of the outer for
        }
    }
    }

