public class Intentest5_18 {
    /*
    * 5.18 Modify the application in Fig. 5.6 to use only integers to calculate the compound interest.
    [Hint: Treat all monetary amounts as integral numbers of pennies. Then break the result into its
    dollars and cents portions by using the division and remainder operations, respectively. Insert a pe-
    riod between the dollars and the cents portions.]*/
    public static void main(String[] args) {

        int amount; // amount on deposit at end of each year
        int principal = 100000; // initial amount (number of pennies)
        double rate = 0.05; // interest rate
        // print the headers
        System.out.printf("%s%20s\n", "Year", "Amount on deposit");

        // calculate amount on deposit for each of ten years

        for (int year = 1; year <= 10; year++) {
            // calculate new amount for specified year
            amount =
                    (int) (principal * Math.pow(1.0 + rate, year));
            int dollars = amount / 100; // calculate dollars portion
            int cents = amount % 100; // calculate cents portion

        // print the year, the dollars portion and a decimal point
            System.out.printf("%4d%,17d.", year, dollars);

        // print the cents portion (with a leading zero if cents < 10 )
            if (cents < 10)
                System.out.printf("0%d\n", cents);
            else
                System.out.printf("%d\n", cents);

        }
    }
}
