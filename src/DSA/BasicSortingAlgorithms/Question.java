package DSA.BasicSortingAlgorithms;
/*
Given an array with N distinct elements, convert the given array to a form
where all elements are in the range from 0 to N-1. The order of elements is
the same, i.e., 0 is placed in the place of the smallest element, 1 is
placed for the second smallest element 1 , ... N-1 is placed for the largest element.
//geeksforgeeks
 */
public class Question {
    public static void print(int []brr){
        int n = brr.length;
        for (int i =0 ;i<n;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int []arr = {40,12,78,34,100,57,23};
        print(arr);
        int n = arr.length;
        int m = 0;
        for(int i = 0 ; i<n;i++){
            int min = Integer.MAX_VALUE;
            int minIdx = -1;
            for(int j = 0; j<n;j++){
                if(min > arr[j]&&arr[j]>0){
                    min = arr[j];
                    minIdx = j;

                }
            }
            arr[minIdx] = m;
            m--;
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arr[i]*-1;
        }
        print(arr);
    }
}
