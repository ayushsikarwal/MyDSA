/*
package com.company;
import java.util.*;

public class Questions_on_arrays {
    public static void main(String[] args){
        float[] marks = new float[5];
        float sum = 0;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < marks.length; i++){
            float inputMarks = sc.nextFloat();
            marks[i] = inputMarks;
            sum = sum + inputMarks;
        }
        System.out.print("Sum of the marks of the student is : ");
        System.out.println(sum);
    }
}
*/
/*package com.company;
import java.util.*;

public class Questions_on_arrays {
    public static void main(String[] args){
        float[] marks = { 89.9f, 87.987f, 98.456f, 67.24f, 87.232f};
        float sum = 0;
        for(int i = 0; i < marks.length; i++){
            sum = sum + marks[i];
        }
        System.out.print("Sum of the marks of the student is : ");
        System.out.println(sum);
    }
}*/
/*
import java.util.*;

public class Questions_on_arrays {
    public static void main(String[] args) {
        int[] num = {342, 45, 2342, 34, 23};
        Scanner sc = new Scanner(System.in);

        for(int j =0; ;j++){
            int input = sc.nextInt();
        for (int i = 0; i< num.length; i++) {

            if (input == num[i]) {
                break;

            }
        }
            System.out.println("Exist in array");
            for(int k=0; k<num.length; k++){
                if (input != num[k]) {
                    break;
                }
                System.out.println("does not exist in the array");
            }

        }
           // System.out.print("does not Exist in array");
        }
    }
*/
/*
import java.util.*;

public class Questions_on_arrays {
    public static void main(String[] args){
    int[] num = {231, 232,12, 432, 102};
    Scanner sc= new Scanner(System.in);
    for(int i = 0; ;i++){
        int input = sc.nextInt();
        if(input == num[0] || input == num[1] || input == num[2] || input == num[3] || input == num[4]) {
            System.out.println("Exist in array");
            break;
        }
        else{
            System.out.println("Does not present in array");
        }
        }
    }
    }*/

/*
public class Questions_on_arrays {
    public static void main(String[] args){
        int[] marks={12, 5 ,23, 24, 30};
        float sum=0;
        for(int i =0; i< marks.length; i++){
            sum = sum + marks[i];
        }
        System.out.println("Average marks in physics is : "+sum/5);
    }
*/
//}


/*
package com.company;

public class Questions_on_arrays {
    public static void main(String[] args) {
        //int [] marks; // A 1-D Array
        int[][] matrix1; // A 2-D Array
        matrix1 = new int[2][3];
        matrix1[0][0] = 101;
        matrix1[0][1] = 102;
        matrix1[0][2] = 103;
        matrix1[1][0] = 201;
        matrix1[1][1] = 202;
        matrix1[1][2] = 203;


        int[][] matrix2; // A 2-D Array
        matrix2 = new int[2][3];
        matrix2[0][0] = 301;
        matrix2[0][1] = 302;
        matrix2[0][2] = 303;
        matrix2[1][0] = 401;
        matrix2[1][1] = 402;
        matrix2[1][2] = 403;


        // Displaying the 2-D Array (for loop)
        System.out.println("Matrix 1");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("Matrix2");
        for (int k = 0; k < matrix1.length; k++) {
            for (int l = 0; l < matrix1[k].length; l++) {
                System.out.print(matrix2[k][l]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        System.out.println("Sum of both the matrices");
        for (int m = 0; m < matrix1.length; m++) {
            for (int n = 0; n < matrix1[m].length; n++) {
                System.out.print(matrix2[m][n] + matrix1[m][n]);
                System.out.print(" ");
            }
            System.out.println();
        }

    }
}*/
/*
public class Questions_on_arrays {
    public static void main(String[] args) {
    int[] num = {12, 10, 234, 675, 134};
    for(int i = num.length-1; i>=0; i--){
        System.out.print(num[i]+" ");
    }
    }
}*/
/*
public class Questions_on_arrays {
    public static void main(String[] args){
    int[] num = {12, 13 ,1209, 3425, 23, 243, 5422};
        int max =  num[0];
    for(int i =0; i< num.length;i++){

        if(num[i]>max){
            max=num[i];

        }

    }
        System.out.println("maximum number is : "+max);
    }
}*/
/*
public class Questions_on_arrays {
    public static void main(String[] args){
    int[] num= {213, 2131, 2311, 12 , 124};
    int min = num[0];
    for(int i =0; i< num.length;i++){
        if(num[i]<min){
            min=num[i];
        }

    }
        System.out.println("The smallest number in array is : "+min);
    }
}*/
public class Questions_on_arrays {
    public static void main(String[] args){
    int[] num = {12,13,14,15,20,24,40};
        boolean isSorted;
    for(int i = 1;i<= num.length;i++){
        if(num[i]>num[i-1]){
            isSorted= true;
        }

      }
    if(isSorted=true){
        System.out.println("Array is sorted");
    }
    else{
        System.out.println("Array is not sorted");
    }
    }
}