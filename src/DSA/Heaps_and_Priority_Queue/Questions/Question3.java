package DSA.Heaps_and_Priority_Queue.Questions;

import java.util.ArrayList;
import java.util.PriorityQueue;

// Sort a 'k' sorted array(sort a nearly sorted array).
public class Question3 {
    static void main(String[] args) {
        int [] arr = {6,5,3,2,8,10,9};
        int k = 3;
        PriorityQueue<Integer> p = new PriorityQueue<>();//min heap
        ArrayList<Integer> ans = new ArrayList<>();
        for(int ele: arr){
            p.add(ele);
            if(p.size()>k) ans.add(p.remove());
        }
        while (p.size()>0) ans.add(p.remove());
        System.out.println(ans);
    }
}
