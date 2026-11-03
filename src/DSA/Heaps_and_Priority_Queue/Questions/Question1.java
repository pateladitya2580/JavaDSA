package DSA.Heaps_and_Priority_Queue.Questions;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Collection;
// Find the kth smallest element in a given array.
public class Question1 {
    static void main(String[] args) {
        int [] arr = {10,2,8,3,-6,-2,9,-12};
        int k = 2 ;
        //MaxHeap
        PriorityQueue<Integer> p = new PriorityQueue<>(Collections.reverseOrder());
        for(int ele : arr){
            p.add(ele);
            if(p.size()>k) p.remove();
        }
        System.out.println("kth smallest ele in array is "+p.peek());
    }
}
