import java.util.Scanner;
public class questions_on_methods {
    /*static int multiplication(int a){
        int c ;
        for(int i=1; i<=10;i++){
            c = i*a;
            System.out.println(c);
        }
            return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        multiplication(n);


    }
}*/

    /* static int star ( int a){
         for (int j = 1; j <= a; j++) {
             for (int i = 0; i < j; i++) {
                 System.out.print("*");
             }
             System.out.println();
         }
         return 0;
     }

 public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     int n=sc.nextInt();
     star(n);
 }*/
    /*static int star(int a) {
        for (int j = a; j > 0; j--) {
            for (int i = 0; i < j; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        star(n);
    }*/
    static int count(int a){
        int sum=0;
        for(int i = 1; i<=a; i++){
            sum= sum+i;
        }
        System.out.println(sum);
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        count(n);
    }
}