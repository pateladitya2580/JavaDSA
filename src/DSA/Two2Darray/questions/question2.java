package DSA.Two2Darray.questions;

import java.util.Scanner;

// write a Java program to find the largest element of a
// given 2D array of integers.
public class question2 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = {{12,32,21,},{45,67,81},{87,53,90}};;
        int max = Integer.MIN_VALUE;
        for(int i = 0 ;i<3;i++){
            for(int j = 0 ;j<3;j++){
                if(max < arr[i][j]){
                    max = arr[i][j];
                }
            }
        }
        System.out.println("The largest element is "+max );
    }
}
//int m = arr.lenght; iss se row ki length
//int n = arr[0].length;coloum ki length
