package DSA.Recursion;

public class Pre_In_post {
    public static void pip(int n){
        if(n == 0) return;//base case
        System.out.print(n+" ");//pre
        pip(n-1);
        System.out.print(n+" ");//in
        pip(n-1);
        System.out.print(n+" ");//post
    }
    static void main(String[] args) {
        pip(3);
    }
}
