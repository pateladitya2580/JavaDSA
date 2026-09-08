package DSA.quick_sort;
//k th largest from the last is = (n-k+1)smallest// leet code 215
public class Kth_smallest_element_in_an_array {
    static int ans ;
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
    public static void  quickSelect(int []arr,int low,int high,int k){
        if(low > high) return;
        if(low == high){
            if(low == k-1) ans = arr[low];
            return;
        }
        int idx = partition(arr,low,high);
        if(idx == k-1){
            ans = arr[idx];
            return;
        }
        if((k-1) < idx) quickSelect(arr,low,idx-1,k);
        else quickSelect(arr,idx+1,high,k);
    }
    static void main(String[] args) {
        int []arr = {4,9,1,2,6,5,8};
        int n = arr.length;
        print(arr);
        int k = 4;
        ans = -1;
        quickSelect(arr,0,n-1,k);
        System.out.println(ans);
    }
}
