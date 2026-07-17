package DSA.Two2Darray.questions;
//Write a program to change the given matrix with its transpose.(square matrix)
public class question6 {
    public static void print(int[][]arr){
        int m = arr.length;
        int n = arr[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    static void main(String[] args) {
        int [][]brr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        print(brr);
        int m = brr.length;
        int n = brr[0].length;
        for(int i = 0 ;i<m;i++){
            for(int j = 0 ;j<=i;j++){
                int temp = brr[i][j];
                brr[i][j] = brr[j][i];
                brr[j][i] = temp;
            }
        }
        print(brr);
    }
}
