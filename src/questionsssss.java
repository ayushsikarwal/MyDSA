/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class questionssssss
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i =0; i<T; i++){
            int X = sc.nextInt();
            int Y = sc.nextInt();
            if(Y%X==0){
                System.out.println(Y/X -1);
            }
            else{
                System.out.println(Y/X);
            }

        }
    }
}
