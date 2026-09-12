package DSA.Advance_sorting.cyclic_sort;
// leet code 268
public class Missing_number {
    public void swap(int i,int j ,int []arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public int missingNumber(int[] arr) {
        int n = arr.length;
        int i = 0;
        while(i<n){
            if(i == arr[i] || arr[i] == n){
                i++;
            }else{
                swap(i,arr[i],arr);
            }
        }
        for ( i = 0 ;i<n;i++){
            if(arr[i] == n) return i;
        }
        return i;// sab ke sab jab 0 ka 0 ,1 ka 1 par ho matlab khud ka index
    }
    static void main(String[] args) {

    }
}
