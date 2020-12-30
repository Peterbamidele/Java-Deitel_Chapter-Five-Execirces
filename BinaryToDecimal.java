import java.util.Scanner;

public class BinaryToDecimal {
        public static void main(String[] args) {
            Scanner scan = new Scanner (System.in);
            System.out.print("Enter value for line pattern : ");
            int userInput = scan.nextInt();
            for(int counter = 1; counter <= userInput; counter++){

                for(int innerCount = 1; innerCount <= userInput; innerCount++){
                    if(counter % 2 == 0){
                        System.out.print("\t");
                    }
                    if(counter % 2 == 1){
                        System.out.print("  ");
                    }
                    System.out.print("* ");
                }

                System.out.println();


//            System.out.println();
            }
        }
}
