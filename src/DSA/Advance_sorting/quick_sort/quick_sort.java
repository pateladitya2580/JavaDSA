package DSA.Advance_sorting.quick_sort;

public class quick_sort {
    public static void print(int []arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    public static void swap(int []arr,int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static int partition(int []arr,int low,int high){
        int pivot = arr[low] ;int pIdx = low;
        int smallest = 0;
        for (int i = low+1; i <= high; i++) {
            if(arr[i]<=pivot){
                smallest++;
            }
        }
        int current_Idx = low + smallest;// current_idx ki splaling galat hai wo correct_indx hai
        //swap arr[pIdx] & arr[current_Idx]
        swap(arr,pIdx,current_Idx);
        int i = low;int j = high;
        while (i < current_Idx && j> current_Idx){
            if(arr[i] <= pivot) i++;
            else if (arr[j]>pivot) j--;
            else if (arr[i]>pivot && arr[j]<=pivot){
                swap(arr,i,j);
            }
        }
        return current_Idx;
    }
    public static void  quickSort(int []arr,int low,int high){
        if(low >= high ) return;
        //pivot (arr[low]) ko sahi jagah rakho
        //& left part me <= pivot
        int idx = partition(arr,low,high);
        quickSort(arr,low,idx-1);
        quickSort(arr,idx+1,high);
    }
    static void main(String[] args) {
        int []arr = {4,9,7,1,2,3,6,5,8};
        int n = arr.length;
        print(arr);
        quickSort(arr,0,n-1);
        print(arr);
    }
}
//Time complexity in avg case = O(n * long n )
//Time complexity in worst case = O(n^2)
//space complexity : recursive call stack space O(log n ) jisko ham 1 bol dete hai
/*
merge sort stable hai but quick sort stable nahi hai
RANDOMIZED PIVOT POINT
Instead if choosing arr[low] as pivot ,we can choose arr[low + high]/2 as pivot
 */