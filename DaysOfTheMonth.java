import javax.swing.JOptionPane;

public class DaysOfTheMonth {

    private static Integer Interger;

    public static void main(String[] args) {
        JOptionPane jOptionPane = null;
        String month = jOptionPane.showInputDialog("Enter the Month Number: ");
        int monthNumber = Interger.parseInt(month);
        switch (monthNumber){
            case 1:
                System.out.println("JANUARY");
                System.out.println("First Month Of The Year");
                break;
            case 2:
                System.out.println("FEBRUARY");
                System.out.println("Second Month Of The Year");
                break;
            case 3:
                System.out.println("MARCH");
                System.out.println("Third Month Of The Year");
                break;
            case 4:
                System.out.println("APRIL");
                System.out.println("Fourth Month Of The Year");
                break;
            case 5:
                System.out.println("May");
                System.out.println("Fifth Month Of The Year");
                break;
            case 6:
                System.out.println("JUNE");
                System.out.println("SIXTH Month Of The Year");
                break;
            case 7:
                System.out.println("JULY");
                System.out.println("SEVENTH Month Of The Year");
                break;
            case 8:
                System.out.println("AUGUST");
                System.out.println("EIGHTH Month Of The Year");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                System.out.println("NINTH Month Of The Year");
                break;
            case 10:
                System.out.println("OCTOBER");
                System.out.println("TEN Month Of The Year");
                break;
            case 11:
                System.out.println("NOVEMBER");
                System.out.println("Eleventh Month Of The Year");
                break;
            case 12:
                System.out.println("DECEMBER");
                System.out.println("TWEVETH MONTH Of The Year");
                break;
            default:
                System.out.println("The number you have enter does not march with any month of the year");
                break;

        }
    }

    public static void setInterger(Integer interger) {
        Interger = interger;
    }
}
