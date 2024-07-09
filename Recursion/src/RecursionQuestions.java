import java.util.*;
public class RecursionQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number upto you want to print numbers :");
        int k = sc.nextInt();
        ascending(k);
        System.out.println();
        descending(k);

    }
    static void ascending (int n ){
        if (n>0){
            ascending(n-1);
            System.out.print(n+" ");
        }
    }
    static void descending (int n ){
        if (n>0){

            System.out.print(n+" ");
            descending(n-1);

        }
    }
}
