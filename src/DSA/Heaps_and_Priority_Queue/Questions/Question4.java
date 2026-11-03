package DSA.Heaps_and_Priority_Queue.Questions;

import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;

//LeetCode 973. K Closest Points to Origin
public class Question4 {
    class Solution {
        public class Triplet implements Comparable<Triplet>{
            int d ;
            int x ;
            int y ;
            Triplet(int d, int x ,int y){
                this.d = d;
                this.x = x;
                this.y = y;
            }
            public int compareTo(Triplet t){
                return this.d - t.d;// aab d ke basis par sorting hogi
            }
        }
        public int[][] kClosest(int[][] points, int k) {
            //Max Heap
            PriorityQueue<Triplet> p = new PriorityQueue<>(Collections.reverseOrder());
            for(int i = 0;i<points.length;i++){
                int x = points[i][0] ,y = points[i][1];
                int d2 = x*x + y*y;
                p.add(new Triplet(d2,x,y));
                if(p.size()>k) p.remove();
            }
            int [][]ans = new int[k][2];
            for(int i = 0 ;i<k;i++){
                Triplet t = p.remove();
                ans[i][0] = t.x;
                ans[i][1] = t.y;
            }
            return ans;
        }
    }
    static void main(String[] args) {

    }
}
