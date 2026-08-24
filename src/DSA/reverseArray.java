package DSA;

public class reverseArray {
    public static void Print( int []brr){
        for(int i = 0 ;i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        Print(arr);
        int n = arr.length;
        int str = 0;
        int end = n-1;
        while (str <= end){
            int temp = arr[str];
            arr[str] = arr[end];
            arr[end] = temp;
            str++;
            end--;
        }
        Print(arr);
    }
}
