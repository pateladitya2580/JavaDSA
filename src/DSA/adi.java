package DSA;

import java.util.Scanner;

public class adi {
    public static void print(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = { 1,2,3,4};
        int []brr = {5,6,7,8,9};
        int []crr = new int[arr.length+brr.length];
        int i =0,j =0,k =0;
        while (i<arr.length && j<brr.length){
            if(arr[i]<brr[j]){
                crr[k++] = arr[i++];
            }
            else{
                crr[k++] = brr[j++];
            }
        }
        while(i<arr.length){
            crr[k++] = arr[i++];
        }
        while (j<brr.length){
            crr[k++] = brr[j++];
        }
        print(crr);
    }
}
