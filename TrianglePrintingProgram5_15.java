public class TrianglePrintingProgram5_15 {
    /*
    * 5.15 (Triangle Printing Program) Write an application that displays the following patterns sep-
arately, one below the other. Use for loops to generate the patterns. All asterisks ( * ) should be print-
ed by a single statement of the form System.out.print('*' ) ; which causes the asterisks to print side
by side. A statement of the form System.out.println(); can be used to move to the next line. A
statement of the form System.out.print(' ' ) ; can be used to display a space for the last two pat-
terns. There should be no other output statements in the program. [Hint: The last two patterns re-
quire that each line begin with an appropriate number of blank spaces.]
*/
    public static void main(String[] args) {
        System.out.println(" | (a) | (b) | (c) | (d)");


        System.out.print("(a)");
        for (int i = 0; i <=10 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print('*');
            }
            System.out.println(' ');
        }

        System.out.println();


        System.out.println("(b)");
        for (int i = 10; i >0; i--) {
            for (int j = 0; j < i ; j++) {
                System.out.print('*');
            }
            System.out.println(' ');
        }

        System.out.println();

        System.out.println("(c)");
        for (int i = 10; i >0; i--) {
            for (int j = 10; j >i ; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i ; j++) {
                System.out.print('*');
            }
            System.out.println(' ');
        }
        System.out.println( );

        System.out.println("(d)");
        for (int i = 0; i <=10 ; ++i) {
            for (int j = 9; j >=i; j--)// reduce the varible counter and
            {
                System.out.print(" ");//print space instead of star
            }
            for (int j = 0; j < i ; j++) {
                System.out.print('*');
            }
            System.out.println();

        }
    }
}

