package DSA;

import java.util.ArrayList;

public class maths {
    static void main(String[] args) {
        int []arr = {10,11,12,13,14,15,16,17,18,19,20};
        ArrayList<Integer>ans = new ArrayList<>();
        int n = arr.length;
        for (int i = 0; i < n ; i++) {
            if(arr[i]%2 == 0){
                ans.add(arr[i]);
            }
        }
        System.out.println(ans);
    }
}
