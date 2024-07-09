public class BitManipulation {
    public static void main(String[] args) {
        int n =68;
        int[] arr={2,3,4,5,4,3,2};
        int num =9;
        int base =2;
        System.out.println(isOdd(n));
        System.out.println(uniqueElement(arr));
        System.out.println(ans(num));
        System.out.println(numberOfDigit(n,base));
        //finding xor from a to b a=3 b=9
        System.out.println(xor(9)^xor(2));
//        brute force approach, will give TLE
        int ans2 =0;
        for (int i = 3; i <=9 ; i++) {
            ans2^=i;
        }
        System.out.println(ans2);
    }
    public static boolean isOdd(int n ){
        return (n&1)==1;
    }
    public static int uniqueElement(int[]arr){
        int unique =0;

        for (int i = 0; i < arr.length; i++) {
            unique^=arr[i];
        }
        return unique;
    }
    public static int ans(int n){
        int res=0;
        int base =5;
        while(n>0){
            int last = n&1;
             n=n>>1;
            res+=base*last;
            base*=5;
        }
        return res;
    }
    public static int numberOfDigit(int n, int base){
        return (int)(Math.log(n)/Math.log(base))+1;
    }
    public static int xor(int a ){
        if(a%4==0){
            return a;
        }
        if(a%4==1){
            return 1;
        }
        if(a%4==2){
            return a+1;
        }
        return 0;
    }
}
