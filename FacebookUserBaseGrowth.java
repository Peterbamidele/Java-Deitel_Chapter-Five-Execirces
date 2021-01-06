public class FacebookUserBaseGrowth {
    /*
    * (Facebook User Base Growth) According to CNNMoney.com, Facebook hit one billion us-
    ers in October 2012. Using the compound-growth technique you learned in Fig. 5.6 and assuming
    its user base grows at a rate of 4% per month, how many months will it take for Facebook to grow
    its user base to 1.5 billion users? How many months will it take for Facebook to grow its user base
    to two billion users?*/
    public static void main(String[] args) {

        double rate = 0.05;
        double growthRate=500000000;
        double total;
        int num;


        System.out.println("Estimated Population growth for 8 months");
        System.out.println();
        System.out.println("Month"+"\tAmount of Users ");



        for(int year=1;year<=36;year++){
            total=growthRate*Math.pow(1.0+rate,year);//this will calculate the total pop growth monthly//tot=growthRate*rate;

            //growthRate+=total;
            System.out.printf("%4d%,20.2f\n", year,total );
        }
        //to find the months needed to Reach a population just enter Population amount and it will calculate the months it will take

        System.out.println("The estimated Population growth will take 15 month for facebook to get to 1 billion users \n And 29 months for it to get to 2 billion users");

    }
    }
