package DSA.Two2Darray.questions;

import java.util.Scanner;

//write a program to store roll no.and marks
//obtained by 4 students side by side in a matrix
public class question1 {
    static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     int [][]arr = new int[4][2];
        System.out.println("Enter the roll no. first then marks");
        //taking value
        for(int i= 0;i<4;i++){
            for(int j = 0 ;j<2;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        // printing out put
        for(int i = 0 ;i<4;i++){
            for(int j = 0;j<2;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
