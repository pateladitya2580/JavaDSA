package DSA.array;

import java.util.Arrays;

public class builtInMethods {
    static void main(String[] args) {
        int [] arr = {30,10,40,23,89,34};
        // for each loop
        // for(int ele:arr){
        // System.out.print(ele+" ");
        // }
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        Arrays.sort(arr);
        System.out.println();
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
