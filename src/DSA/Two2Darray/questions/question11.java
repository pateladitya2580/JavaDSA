package DSA.Two2Darray.questions;
//multiplication of matrix
/*
1 2 1  1 0 1 2
2 1 2  2 1 0 0
       0 3 1 1
ans 5 5 2 3
    4 7 4 6

 */
public class question11 {
    static void main(String[] args) {
        int [][] a = {{1,2,1},{2,1,2}};
        int [][] b = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        int [][]c = new int[a.length][b[0].length];
        if(a[0].length!=b.length) System.out.println("Matrix multiplication not possible");
        else{
            for (int i = 0; i < c.length; i++) {
                for (int j = 0; j < c[0].length; j++) {
                    //c[i][j] = a[i][0]*b[0][j] + a[i][1]*b[1][j]+a[i][2]*b[2][j]
                    for (int k = 0; k < a[0].length; k++) {
                        c[i][j] += a[i][k]*b[k][j];
                    }
                }
            }
        }
        for (int i = 0; i < c.length ; i++) {
            for (int j = 0; j < c[0].length ; j++) {
                System.out.print(c[i][j]+" ");
            }
            System.out.println();
        }
    }
}
