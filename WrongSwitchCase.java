public class WrongSwitchCase {
    public static void main(String[] args) {
        int x =10;
        switch (x){
            case 97:
                System.out.println(97);
                break;
            case 98:
                System.out.println(98);
                break;
            case 99:
                System.out.println(99);
                break;
            case 100:
                System.out.println(100);//duplicate case label
        }
    }
}
