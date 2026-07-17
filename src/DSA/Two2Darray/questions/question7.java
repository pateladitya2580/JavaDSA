package DSA.Two2Darray.questions;
//Write a program to rotate the matrix by 90 degrees clockwise.
public class question7 {
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
        int [][]arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);
        int m = arr.length;
        int n = arr[0].length;
        for(int i = 0 ;i<m;i++){
            for(int j = 0 ;j<=i;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);
        for (int i = 0; i < m; i++) {
            int j = 0, k = n-1;
          while (j<=k){
              int temp = arr[i][j];
              arr[i][j] = arr[i][k];
              arr[i][k] = temp;
              j++;k--;
          }
        }
        print(arr);
    }
}
