package DSA.Heaps_and_Priority_Queue.Questions;
import java.util.*;

// LeetCode 658. Find K Closest Elements
public class Question5 {
    class Solution {
        public class Pair implements Comparable<Pair>{
            int ele;
            int diff;
            Pair(int ele,int diff){
                this.ele = ele;
                this.diff = diff;
            }
            public int compareTo(Pair P){
                if(this.diff == P.diff){
                    return this.ele - P.ele;
                }
                return  this.diff - P.diff;
            }
        }

        public List<Integer> findClosestElements(int[] arr, int k, int x) {
            //max heap
            PriorityQueue<Pair> p = new PriorityQueue<>(Collections.reverseOrder());
            for(int ele: arr){
                int diff = Math.abs(x - ele);
                p.add(new Pair(ele,diff));
                if(p.size()>k) p.remove();
            }
            ArrayList<Integer> ans = new ArrayList<>();
            while (p.size()>0){
                Pair temp = p.remove();
                ans.add(temp.ele);
            }
            Collections.sort(ans);
            return ans;
        }
    }
    static void main(String[] args) {

    }
}
