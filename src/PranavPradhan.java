import java.util.Scanner;

public class PranavPradhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println(sum(x,y));


    }
    public static int sum(int x, int y){
        return x+y;
    }

    public boolean evenOrOdd(int x){
        return x%2==0;
    }
}
