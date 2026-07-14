package DSA.array.question;

import java.util.Scanner;

//Sort the array of 0's ,1's and 2's .(Dutch Flag Algorithm)
public class question10DutchFlagAlgo {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {0,1,2,0,1,2,1,2,0,0};
        int n = arr.length;
        // one pass solution
//        int nofozero = 0;
//        int noofone = 0;
//        for(int i = 0 ;i<n;i++){
//            if(arr[i]==0) nofozero++;
//            if(arr[i]==1) noofone++;
//        }
//        for(int i =0 ;i<n ;i++){
//            if(i<nofozero) arr[i]=0;
//            else if (i< (nofozero+noofone)) arr[i] = 1;
//            else arr[i] = 2;
//        }
//        for(int ele:arr){
//            System.out.print(ele+" ");
//        }

        // dutch flag algo
        //low se phele zero
        //high ke baad two
        //low se lekar mid tak one
        //mid or high tak pura array
        //main point
        //low se phele saare 0 hone chaiye
        // high ke baad saare 2 hone chaiye
        // mid se phele 1 hone chaiye

        int mid = 0;
        int low = 0;
        int high = n-1;
        while (mid<=high){
            if(arr[mid]==0){
                int temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if (arr[mid]== 1) mid++;
            else if(arr[mid]==2 ){
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
