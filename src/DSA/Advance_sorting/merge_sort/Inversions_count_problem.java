package DSA.Advance_sorting.merge_sort;
/* similar question 493
Array me inversion tab hota hai jab:
i < j  AND  a[i] > a[j]
Matlab left side ka element right side ke element se bada ho.
 */
public class Inversions_count_problem {
    //global variable
    static int count;
    //inversion method
    public static void inversion(int []a,int []b){
        int i = 0,j = 0;
        while (i< a.length && j< b.length){
            if(a[i]>b[j]){
                count += (a.length - i);
                j++;
            }
            else{
                i++;
            }
        }
    }
    //print method
    public static void print(int []arr){
        for(int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    //combine two sorted array
    public static void combine(int []a,int []b,int []c){
        int i = 0,j = 0 ,k = 0;
        while (i < a.length && j< b.length){
            if(a[i] <= b[j]) c[k++] = a[i++];
            else c[k++] = b[j++];
        }
        while (j < b.length) c[k++] = b[j++];
        while (i < a.length) c[k++] = a[i++];
    }
    // merge sort method
    public static void mergesort(int []arr){
        int n = arr.length;
        if(n == 1) return;//base case
        // create two arrays
        int []a = new int [n/2];
        int []b = new int [n - n/2];
        //coping
        for (int i = 0; i < a.length ;i++) {
            a[i] = arr[i];
        }

        for (int i = 0; i < b.length; i++) {
            b[i] = arr[i+n/2];
        }
        // magic
        mergesort(a);
        mergesort(b);
        //inversion method use
        inversion(a,b);
        // combine two sorted array
        combine(a,b,arr);
        //delete a and b to improve space complexity to O(n)
        a = null; b = null;
    }
    static void main(String[] args) {
        int []a = {80,30,50,20,60,10,70};
        print(a);
        mergesort(a);
        print(a);
        System.out.println(count);
    }
}
