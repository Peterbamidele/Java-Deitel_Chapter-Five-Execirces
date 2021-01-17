public class Exercises5_19 {
    /*
  * Assume that i = 1 , j = 2 , k = 3 and m = 2 . What does each of the following statements print?
a) System.out.println( i == 1 );
ANS: true.
b) System.out.println( j == 3 );
ANS: false.
c) System.out.println( ( i >= 1 ) && ( j < 4 ) );
ANS: true.
d) System.out.println( ( m <= 99 ) & ( k < m ) );
ANS: false.
e) System.out.println( ( j >= i ) || ( k == m ) );
ANS: true.
f) System.out.println( ( k + m < j ) | ( 3 - j >= k ) );
ANS: false.
g) System.out.println( !( k > m ) );
ANS: false.*/
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        int k = 3;
        int m = 2;
        // part a
        System.out.println( i == 1 );
        // part b
        System.out.println( j == 3 );
        // part c
        System.out.println( ( i >= 1 ) && ( j < 4 ) );
        // part d
        System.out.println( ( m <= 99 ) & ( k < m ) );
            // part e
        System.out.println( ( j >= i ) || ( k == m ) );
        // part f
        System.out.println( ( k + m < j ) | ( 3 - j >= k ) );
            // part g
        System.out.println( !( k > m ) );
    }

}
