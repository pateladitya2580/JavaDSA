package DSA.array.question;

import java.util.Scanner;

/*Rotate the given array 'a' by k steps ,where k is
non - negative.*/
public class question8RotateArray {
    public static void rotate(int []arr,int i ,int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {10,20,30,40,50,60,70};
        System.out.println("enter the value of k ");
        int k = sc.nextInt();
        int n = arr.length;
        k = k%n;

        // using extra array
//        int []brr = new int[n];
//        int i = 0;
//        for(int j = n-k;j<=n-1;j++){
//            brr[i++] = arr[j];
//        }
//        for (int j = 0 ;j< n-k;j++){
//            brr[i++] = arr[j];
//        }
//
//        for(int ele:brr){
//            System.out.print(ele+" ");
//        }
        // without using extra array
        rotate(arr,0,n-k-1);
        rotate(arr,n-k,n-1);
        rotate(arr,0,n-1);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
