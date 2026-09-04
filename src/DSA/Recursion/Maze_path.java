package DSA.Recursion;
import java.util.*;
public class Maze_path {
    public static int maze(int row,int coloum,int m,int n ){// from 1,1 to m,n
       if(row == m || coloum == n) return 1;//base case
       int right_ways = maze(row,coloum + 1,m,n);
       int down_ways = maze(row + 1,coloum,m,n);
       return right_ways + down_ways;
    }
    //from (m,n) to (1,1)
    public static int maze2(int m,int n){
        if( m == 1 || n == 1) return 1;
        int right_ways = maze2(m,n-1);
        int down_ways = maze2(m-1,n);
        return right_ways + down_ways;
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row ");
        int m = sc.nextInt();
        System.out.println("Enter the coloum ");
        int n = sc.nextInt();
        //System.out.println("No. of paths is "+maze(1,1,m,n));
        System.out.println("No. of paths is "+maze2(m,n));
    }
}
