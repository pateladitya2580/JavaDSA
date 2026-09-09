package DSA.Advance_sorting.merge_sort;

public class merge_two_sorted_arrays {
    public static void combine(int []a,int []b,int []c){
        int i = 0,j = 0 ,k = 0;
        while (i < a.length && j< b.length){
           if(a[i] <= b[j]) c[k++] = a[i++];
           else c[k++] = b[j++];
        }
        while (j < b.length) c[k++] = b[j++];
        while (i < a.length) c[k++] = a[i++];
    }

    public static void print(int []arr){
        for(int ele:arr){
            System.out.print(ele +" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int []a = {10,30,50,60,80,90};
        int []b = {21,42,72,78};
        print(a);
        print(b);
        int []c = new int [a.length + b.length];
        combine(a,b,c);
        print(c);
    }
}
