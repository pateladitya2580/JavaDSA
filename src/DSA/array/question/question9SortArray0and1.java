package DSA.array.question;

import java.util.Scanner;

//sort the array of 0's and 1's.
public class question9SortArray0and1 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {1,0,0,1,1,0,0,0,1,0};
        System.out.println("Given Array");
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        //One Pass solution
//        System.out.println();
//        int noOfzero = 0;
//        int noOfone = 0;
//        int n = arr.length;
//        for(int i = 0;i<=n-1;i++){
//            if(arr[i]==0){
//                noOfzero++;
//            }
//        }
//        noOfone = n-noOfzero;
//        for(int i = 0 ;i<n;i++){
//            if(i<noOfzero) arr[i] =0; // yaha ham array 0 se start kar rahe hai isliye < liya jai na ki<=.
//            else arr[i] = 1;
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }
        //Two pass solution
        int i = 0, j = arr.length-1;
        while (i<j){
            if(arr[i]==0) i++;
            else if (arr[j]==1) j--;
            else if(arr[i]== 1&&arr[j]==0 ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] =temp;
                i++;
                j--;
            }
        }
        for(int ele:arr){
            System.out.print(ele+" ");
        }

    }
}
