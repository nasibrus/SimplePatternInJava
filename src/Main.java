/**
 *
 * @author Ruslan Nasibov (@nasibrus)
 */
public class Main {

    public static void main(String[] args) {
        pattern1();
        pattern2();
        pattern3();
        pattern4();
        pattern5();

    }

    public static void pattern1() {
        /*
         **********
         **********
         **********
         **********
         **********
         */
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern2() {
        /*
         *
         **
         ***
         ****
         *****
         ******
         *******
         */
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

    public static void pattern3() {
        /*
         *
         **
         ***
         ****
         *****
         ******
         *******
         */
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }

    public static void pattern4() {
        /*
         ********
         *******
         ******
         *****
         ****
         ***
         **
         *
         */
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8 - i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            System.out.println("");
        }
    }

    /**
     *
     */
    public static void pattern5() {
        /*
        = = =  = = =
        = = =  = = =
        = = =  = = =
         */
        for (int j = 0; j < 4; j++) {
            for (int i = 0; i < 6; i++) {
                System.out.print("=");
                if (i != 2) {
                    System.out.print(" ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }

    }

}
