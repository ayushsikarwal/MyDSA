public class Patternshahhahaha {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <5 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        pattern2();
        pattern3();
        pattern4();
        pattern5();
        pattern6();
        pattern7();
        pattern8();
       // pattern9();

    }

    static void pattern2(){
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern3(){
        for (int i = 6; i >=0 ; i--) {
            for (int j = i; j >=0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern4(){
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
    static void pattern5(){
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <i+1 ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 6; i >=0 ; i--) {
            for (int j = i; j >=0 ; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6() {
        for (int i = 0; i < 6; i++) {
            for (int k = 0; k < 6 - i - 1; k++) {
                System.out.print(" ");  // Print spaces before the asterisks
            }
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern7() {
        for (int i = 6; i >= 0; i--) {
            for (int k = 0; k < 6 - i; k++) {
                System.out.print(" ");  // Print spaces before the asterisks
            }
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern8() {
        for (int i = 6; i >= 0; i--) {
            for (int k = 0; k < (6 - i)/2; k++) {
                System.out.print(" ");  // Print spaces before the asterisks
            }
            for (int j = i; j >= 0; j--) {
                System.out.print("*");
            }
            for (int k = 0; k < (6 - i)/2; k++) {
                System.out.print(" ");  // Print spaces before the asterisks
            }
            System.out.println();
        }
    }
//    static void pattern9() {
//        for (int i = 0; i < 6; i++) {
//            int length = (6-i)/2;
//           if ( length%2!=0){
//              continue;
//           }
//            for (int k = 0; k < length; k++) {
//                System.out.print(" ");  // Print spaces before the asterisks
//            }
//            for (int j = 0; j < i+1; j++) {
//                System.out.print("*");
//            }
//            for (int k = 0; k < length; k++) {
//                System.out.print(" ");  // Print spaces before the asterisks
//            }
//            System.out.println();
//        }
//    }
}
