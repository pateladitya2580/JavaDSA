package DSA.Two2Darray;

public class basic {
    static void main(String[] args) {
        int[][] arr = new int[2][2];
//        int[][]arr = {{2,3,4},{4,3,1}}; three coloum and two row
        arr[0][0] = 2;
        arr[0][1] = 3;
        arr[1][0] = 4;
        arr[1][1] = 5;
        System.out.println(arr[0][1]);
        // by loop
        for(int i = 0;i<2;i++){
            for(int j = 0 ;j<2;j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        //for each loop
        for(int [] ele : arr){
            for(int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
