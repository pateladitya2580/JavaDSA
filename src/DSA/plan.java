package DSA;

public class plan {
    static void main(String[] args) {
        int []arr = {1,2,3,4,5,2,1};
        int n = arr.length;
        int i = 0, j = n-1;
        boolean flag = false;
        while (i<j){
            if(arr[i] != arr[j]){
                System.out.println("Not a plan");
                flag = true;
                break;
            }
            i++;
            j--;
        }
        if(flag == false){
            System.out.println("plan");
        }
    }
}
