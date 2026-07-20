package DSA.Two2Darray.ArrayLIst2D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2Dimensional {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        a.add(10);a.add(42);a.add(30);
        List<Integer> b = new ArrayList<>();
        b.add(40);b.add(50);
        List<Integer>c = new ArrayList<>();
        List<Integer> d = new ArrayList<>();
        d.add(60) ;

        List<List<Integer>> l = new ArrayList<>();
        l.add(a);l.add(b);l.add(c);l.add(d);

//        for(int i = 0 ;i<l.size();i++){
//            System.out.println(l.get(i));// ise ek sath puri list of list print hogi
//        }
//        System.out.println(l.get(1));
//        System.out.println(l.get(1).get(1));
        for (int i = 0; i <l.size() ; i++) {
            for (int j = 0; j < l.get(i).size(); j++) {
                System.out.print(l.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }
}
