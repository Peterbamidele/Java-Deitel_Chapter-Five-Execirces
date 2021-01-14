public class Exercise5_7 {
    public static void main(String[] args) {

        //Discuss a situation in which it would be more appropriate to use a do ... while statement than a while statement. Explain why.

       //ANSWER
       /*: If you want some statement or set of statements to execute at least once, then repeat based on a condition, a do ... while is more appropriate than a while (or a for ).
       1. A do - while statement tests the loop-continuation condition after executing the loop’s body; therefore, the body always executes at least once.
       11.A while tests the loop-continuation condition before executing the loop’s body, so the program would need to include the statement(s) required to execute at least once both before the loop and in
        the body of the loop.
       iii.Using a do - while avoids this duplication of code. Suppose a program needs to obtain an integer value from the user, and the integer value entered must be positive for the program to continue. In this case, a do ... while ’s body could
        contain the statements required to obtain the user input, and the loop-continuation condition could determine whether the value entered is less than 0. If so, the loop
        would repeat and prompt the user for input again. This would continue until the user entered a value greater than or equal to zero. Once this criterion wa met, the loop continuation condition would become false, and the loop would terminate, allowing
        the program to continue past the loop. This process is often called validating input.**/
        
    }
}
