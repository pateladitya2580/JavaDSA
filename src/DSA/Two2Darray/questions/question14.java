package DSA.Two2Darray.questions;
// leetcode 73
//Given an m*n integer matrix matrix ,if an element is
//0,set its entire row and column to 0's.
public class question14 {
    public void setZeroes(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        boolean zeroRow = false;
        boolean zeroColumn = false;
        //check the 0th row
        for(int j = 0 ; j<n;j++){
            if(arr[0][j]==0){
                zeroRow = true;
                break;
            }
        }
        //check the 0th column
        for(int i = 0 ; i<m;i++){
            if(arr[i][0]==0){
                zeroColumn = true;
                break;
            }
        }
        //traverse in the submatrix without 0th row and oth col
        for(int i = 1;i<m;i++){
            for(int j = 1;j<n ;j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }
        //traverse in the 0th row
        for(int j = 1; j<n;j++){
            if(arr[0][j]==0){
                for(int i = 1;i<m;i++){
                    arr[i][j]=0;
                }
            }
        }
        //traverse in the 0th coloum
        for(int i = 1;i<m;i++){
            if(arr[i][0]==0){
                for(int j = 1 ;j<n;j++){
                    arr[i][j] = 0;
                }
            }

        }

        if(zeroRow==true){// set the 0th row to 0
            for(int j = 0 ;j<n;j++ ){
                arr[0][j] = 0;
            }
        }
        if(zeroColumn == true){//set the 0th column to 0
            for(int i = 0 ;i<m;i++){
                arr[i][0] = 0;
            }
        }
    }
    static void main(String[] args) {

    }
}
