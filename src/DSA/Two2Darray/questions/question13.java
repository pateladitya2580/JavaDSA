package DSA.Two2Darray.questions;

import java.util.Scanner;

/*
leetcode 240
Write an efficient algorithm that searches for a value target
in an m*n integer matrix which has the following properties;
- Integers in each row are sorted in ascending from left to right.
- Integers in each column are sorted in ascending from top to bottom
 */
public class question13 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = {{1,4,7,11,15},{2,5,8,12,19},{3,6,9,16,22},{10,13,14,17,24},{18,21,23,26,30}};
        int m = arr.length;
        int n = arr[0].length;
        System.out.println("Enter the target element ");
        int x = sc.nextInt();
        int i = 0 , j = n-1;
        boolean flag = false;
        while (i<m && j >=0){
            if(arr[i][j]==x) {
                flag = true;
                break;
            } else if (arr[i][j]>x) {
                j--;
            }
            else {
                i++;
            }
        }
        if(flag == false) System.out.println("Element is not found");
        else System.out.println("Element is found");
    }
}
