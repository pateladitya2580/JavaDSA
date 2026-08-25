package DSA;

import java.util.Scanner;

public class rotateTheArray {
    public static void Print( int []brr){
        for(int i = 0 ;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
    }

    public static  void reverse(int []arr,int str,int end){
        int n = arr.length;
        while (str <= end){
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;
            str++;
            end--;
        }
        System.out.println();
    }

    static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the k ");
        int k = sc.nextInt();
        int []arr = {0,1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        Print(arr);
        reverse(arr,0,k);
        Print(arr);
        reverse(arr,k+1,n-1);
        Print(arr);
        reverse(arr,0,n-1);
        Print(arr);

    }
}
