package DSA.Two2Darray.questions;

import java.util.Scanner;

//Write a program to add two matrices
public class question4 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = new int[3][3];
        //taking input
        System.out.println("Enter the first matrix");
        for(int i = 0 ;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int [][]brr = {{9,3,7},{8,6,5},{2,4,1}};
        //adding
        int [][]crr = new int[3][3];
        for(int i = 0 ;i<crr.length;i++){
            for(int j = 0;j< crr[0].length;j++){
                crr[i][j] = arr[i][j] + brr[i][j];
            }
        }
        //print
        for (int i = 0; i <crr.length ; i++) {
            for (int j = 0; j < crr[0].length; j++) {
                System.out.print(crr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
/*
first matrix
1 9 2
3 7 4
8 5 6
 */