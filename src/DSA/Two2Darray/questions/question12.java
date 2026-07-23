package DSA.Two2Darray.questions;

import java.util.Scanner;

//Score After flipping Matrix ,Leetcode 861
//hint 1 = starting ke har row ke element ko 1 karo
//hint 2 = phir jis column me 0 jyada hai usko flip karo or 1 banao
public class question12 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][]a = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m = a.length,n = a[0].length;
        //put 1 at the 0th position of every row
        for (int i = 0; i < m; i++) {
            if(a[i][0]==0){//flip that row
                for (int j = 0; j < n; j++) {
                    if(a[i][j]==0) a[i][j]= 1;
                    else a[i][j]=0;
                }
            }
        }
        //flip those columns where (no of 0s > no of 1s)
        for (int j = 1; j < n; j++) {
            int noOfzero = 0;
            int noOfOne = 0;
            for (int i = 0; i < m; i++) {
                if(a[i][j]==0) noOfzero++;
                else noOfOne++;
            }
            if(noOfzero>noOfOne){// flip that column
                for (int i = 0; i < m; i++) {
                    if(a[i][j]==0) a[i][j]=1;
                    else a[i][j]=0;
                }
            }
        }
        // calculating the score
        int sum = 0;
        int x = 1;
        for (int j = n-1; j >=0; j--) {
            for (int i = 0; i < m; i++) {
                sum += a[i][j]*x;
            }
            x *=2;
        }
        System.out.println("Tne ans is "+sum);
    }
}
//ans 39