package DSA.Two2Darray.questions;

import java.util.Scanner;

//Write a program to print the matrix in wave form.
/*
 1 2 3
 4 5 6
 7 8 9

 ans 1 2 3 6 5 4 7 8 9
 */
public class question8 {
    public static void print(int [][]arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0){
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for (int j = arr[0].length-1; j >=0 ; j--) {
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}
