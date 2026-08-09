package DSA.BasicSortingAlgorithms;
/*
Insertion sort is a simple sorting algorithm that builds the final
sorted array one element at a time. It works by taking each element
from the unsorted part and inserting it into its correct position in
the sorted part of the array.
 */
public class InsertionSort {
    public static void print(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int []arr = {10,-4,20,1,-6,8};
        print(arr);
        //Insertion sort// Stable sort
        int n  = arr.length;
        for (int i = 1; i < n; i++) {// n-1 passes hi hai
            for (int j = i; j >=1; j--) {
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else break;
            }
        }
        print(arr);

    }
}
//Time Complexity = O(n^2) == Avg.case== worst case
//best case = O(n)