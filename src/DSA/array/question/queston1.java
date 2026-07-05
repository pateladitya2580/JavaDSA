package DSA.array.question;

import java.util.Scanner;

public class queston1 {
    //given an array of marks of students,if the mark of any student is less
    //than 35 print its roll no.{ roll no. here refers to the index of the array.
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int n = sc.nextInt();
        int []arr = new int[n];

        //input
        for(int i = 0;i<=n-1;i++){
            arr[i] = sc.nextInt();
        }

        //output
        for(int i = 0;i<=n-1;i++){
            if(arr[i]<35){
                System.out.println("The roll no. is "+i+" ");
            }
        }
    }
}
