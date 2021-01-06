public class DiamondPrintingProgram5_24 {
    /*
    * (Diamond Printing Program) Write an application that prints the following diamond
        shape. You may use output statements that print a single asterisk ( * ), a single space or a single new-
        line character. Maximize your use of repetition (with nested for statements), and minimize the
        number of output statements.*/
    public static void main(String[] args) {
//        for (int i = 0; i <= 5; i++) {
//            for (int j = 0; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//
//            }
//        for (int j = 5; j > 0; j--) {
//            for (int k = 1; k <= j; k++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }

        for (int i = 0; i <=5 ; i++) {
            for (int y = 0; y <=5-i ; y++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 5; i >=0 ; i--) {
            for (int y = 0; y <=5-i ; y++) {
                System.out.print(" ");
            }
            for (int j = 0; j <=i ; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }
}


