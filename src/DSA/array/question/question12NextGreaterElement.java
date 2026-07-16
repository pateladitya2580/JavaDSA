package DSA.array.question;
//Next greatest element.
//        arr[] = {12,8,41,37,2,49,16,28,21}
//        ans[] = {49,49,49,49,49,28,28,21,-1}
public class question12NextGreaterElement {
    static void main(String[] args) {
        int []arr = {12,8,41,37,2,49,16,28,21};
        int n = arr.length;
        int []brr = new int [n];
        // method 1 :Brute Force
//        for(int i = 0;i<n;i++){
//            int max = -1;
//            for(int j = i+1;j<n;j++){
//                if(max<arr[j]){
//                    max = arr[j];
//                }
//            }
//            brr[i]=max;
//        }
        //method 2

        brr[n-1] =-1;
        int nextGI = arr[n-1];
        for(int i = n-2;i>=0;i--){
            brr[i]= nextGI;
            nextGI = Math.max(arr[i],nextGI);
        }
        for(int ele:brr){
            System.out.print(ele+" ");
        }
    }
}
