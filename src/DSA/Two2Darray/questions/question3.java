package DSA.Two2Darray.questions;

import java.util.Scanner;

//Write a program to print sum of all the elements of a
//2D matrix
public class question3 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = {{12,32,21,},{45,67,81},{87,53,90}};;
        int sum = 0;
        for(int i = 0 ;i<3;i++){
            for(int j = 0 ;j<3;j++){
                sum += arr[i][j];
            }
        }
        System.out.println("The sum is "+sum );
    }
}
