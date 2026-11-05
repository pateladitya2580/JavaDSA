package DSA.Heaps_and_Priority_Queue.Questions;

import java.util.PriorityQueue;

//Minimum Cost to Connect all ropes
//I can connect 2 ropes at a time and the cost
//of joining is the sum of length of ropes.
public class Question8 {
    static void main(String[] args) {
        int []arr = {2,7,4,1,8};// cost 46
        PriorityQueue<Integer> p = new PriorityQueue<>();//min heap
        for(int ele: arr){
            p.add(ele);
        }
        int cost = 0;
        while(p.size()>1){
            int x = p.remove();
            int y = p.remove();
            cost += (x+y);
            p.add(x+y);
        }
        System.out.println("The cost is "+cost);
    }
}
