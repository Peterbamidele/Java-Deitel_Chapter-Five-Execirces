public class Interest5_14 {
    public static void main(String[] args) {

        double principal = 1000.0;
        // print out statistics for each rate
        for (int interestRate = 5; interestRate <= 10; interestRate++)
        {
            double rate = interestRate / 100.0;
            System.out.printf("\nInterest Rate: %d%%\n", interestRate);
            System.out.println("Year\tAmount on deposit");

            // for each rate, print a ten-year forecast
            for (int year = 1; year <= 10; year++) {
                double amount = principal * (1.0 + rate);

                // raise the amount to the power of the year
                for (int power = 2; power <= year; power++)
                    amount *= (1.0 + rate);
                System.out.printf("%d\t\t%.2f\n", year, amount);
            }
        }
    }
}
