package DSA.array;

import java.util.Scanner;

public class basicSyntax {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = new int[5];
        // initialising individual elements
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        // output of array elements
        System.out.print(arr[0] + " ");
        System.out.print(arr[1] + " ");
        System.out.print(arr[2] + " ");
        System.out.print(arr[3] + " ");
        System.out.print(arr[4] + " ");


        //update
        arr[0] = 99;
        System.out.println(arr[0]+" ");

        // input by loop
        for(int i = 0 ; i<=4;i++){
            arr[i] = sc.nextInt();
        }
        //output of array by loop
        for(int i = 0; i<=4; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
// array ko jab ham method me pass karte hai to pass by referance hota hai
// or jab koi inter ko pass karte hai to pass by value hota hai