package DSA.Two2Darray.questions;

import java.util.Scanner;

//Write a program to print the matrix in spiral form.
/*
1 2 3
4 5 6
7 8 9
ans 1 2 3 6 9 8 7 4 5
 */
public class question9 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        int cl = 0,rl = 0 , ch = arr[0].length-1;
        int rh = arr.length -1;
        while(rl <= rh && cl<=ch){
            //left to right
            for(int i = cl;i<=ch;i++){
                System.out.print(arr[rl][i]+" ");
            }
            rl++;
            //top to bottom
            if(rl>rh||cl>ch) break;
            for (int i = rl; i <=rh; i++) {
                System.out.print(arr[i][ch]+" ");
            }
            ch--;
            //right to left
            if(rl>rh||cl>ch) break;
            for(int i = ch ;i>=cl;i--){
                System.out.print(arr[rh][i]+" ");
            }
            rh--;
            //bottom to top
            if(rl>rh||cl>ch) break;
            for(int i = rh;i>=rl;i--){
                System.out.print(arr[i][cl]+" ");
            }
            cl++;
        }
    }
}
