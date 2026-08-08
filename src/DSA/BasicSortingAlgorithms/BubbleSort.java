package DSA.BasicSortingAlgorithms;
/*
Bubble Sort ek simple sorting algorithm hai jo adjacent (paas-paasi)
elements ko compare karta hai. Agar left wala element right wale se bada
ho, to dono ko swap kar deta hai. Har pass ke baad sabse bada element
end me apni correct position par pahunch jata hai, isi liye ise Bubble Sort
kehte hain.
 */
public class BubbleSort {// Bubble sort Stable sort hai
    public static void print(int []arr){
        for(int ele:arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        int []arr = {5,8,1,-3,8,10};//3,1,2,5,4 isme sahi ayega single pass me
        int n = arr.length;//5,8,1,-3,8,10 isme multiple pass lagenge
        print(arr);
        //Bubble sort // Time complexity of bubble sort is n^2
        for (int x = 0; x < n-1; x++) {// n-1 pass
            boolean flag = true;
            for (int i = 0; i <n-1-x ; i++) {
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    flag = false;
                }
            }
            if(flag== true) break;
        }
        print(arr);

    }
}
/* lc 283
Stable Sort

Definition:
Stable Sorting Algorithm wo hota hai jo same value wale elements ka
original order maintain rakhta hai sorting ke baad bhi.

Example

Original Array:

(5,A) (3,B) (5,C) (2,D)

Ascending Sort:

(2,D) (3,B) (5,A) (5,C)

👉 Yaha 5,A pehle tha aur 5,C baad me tha. Sorting ke baad bhi unka
    order same hai.
==================================================================================
Unstable Sort

Definition:
Unstable Sorting Algorithm wo hota hai jo same value wale elements ka
original order change kar sakta hai.

Example

Original Array:

(5,A) (3,B) (5,C) (2,D)

Ascending Sort:

(2,D) (3,B) (5,C) (5,A)

👉 Yaha 5,A aur 5,C ka order change ho gaya. Isliye ye Unstable Sort hai.
 */
