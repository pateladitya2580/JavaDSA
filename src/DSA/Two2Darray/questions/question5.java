package DSA.Two2Darray.questions;
//write a program to print the transpose of the matrix
//entered by the user and store it in a new matrix.
public class question5 {
    static void main(String[] args) {
        int[][]arr = {{1,2},{3,4},{5,6}};
        int[][]transpose = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                transpose[j][i] = arr[i][j];
            }

        }
        //print
        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }

    }
}
