package DSA.BasicSortingAlgorithms;
/*
In every pass ,we find the k^th(first smallest,second smallest etc) smallest
element and put it in its right place.
 */
public class SelectionSort {
    public static void print(int []arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int []arr = {10,-4,20,1,-6,8};
        print(arr);
        //selection sort //Time Complexity = O(n^2)//Unstable sort
        int n  = arr.length;
        for (int i = 0; i <n-1 ; i++) {
            int min = Integer.MAX_VALUE;
            int mindx = -1;
            for (int j = i; j < n ; j++) {
                if(arr[j]<min){
                    min = arr[j];
                    mindx = j;
                }
            }
            //swap
            int temp = arr[i];
            arr[i] = arr[mindx];
            arr[mindx] = temp;
        }
        print(arr);
    }
}
/*
## Comparison of Selection Sort and Bubble Sort

* **Selection Sort:**
* Cannot be optimized
* Unstable sort
* Number of swaps are less (n - 1 swaps)
* Best case time complexity is O(n^2)
-----------------------------------------------------------------------------
* **Bubble Sort:**
* Can be optimized
* Stable sort
* Number of swaps are more (n*(n-1)/2 max swaps)
* Best case time complexity is O(n)
-----------------------------------------------------------------------------
 Note:If the cost of swapping is something to consider, then selection
 sort is better.
 */
