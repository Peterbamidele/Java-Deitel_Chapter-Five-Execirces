public class WrongSwitchCase2 {
    public static void main(String[] args) {
        byte b =10;
        switch (b){
            case 10:
                System.out.println(10);
                break;
            case 100:
                System.out.println(100);
                break;
//            case 1000:
//                System.out.println(1000);
                //java: incompatible types: possible lossy conversion from int to byte
                //possible loss of Precision
                //found: int
                // required byte
        }

    }


}
