package DSA.HashMaps_and_HashSets.HashSet;

import java.util.HashSet;
import java.util.TreeSet;

public class Iterating_over_Hashsets {
    static void main(String[] args) {
        int []arr = {4,9,2,6,4,8,1};
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
        HashSet<Integer> set = new HashSet<>();
        set.add(20);
        set.add(100);
        set.add(10);
        set.add(-8);
        set.add(200);
        for(int ele: set){
            System.out.print(ele+" ");//iterate karte time na kuch add hoga
            // na remove hoga
        }
        System.out.println();

        //-------------------------------------------------------------------
        TreeSet<Integer> set1 = new TreeSet<>();
        set1.add(20);
        set1.add(100);
        set1.add(10);
        set1.add(-8);
        set1.add(200);

        for(int ele: set1){
            System.out.print(ele+" ");// treeSet sort kar ke print karta hai
        }
    }
}
