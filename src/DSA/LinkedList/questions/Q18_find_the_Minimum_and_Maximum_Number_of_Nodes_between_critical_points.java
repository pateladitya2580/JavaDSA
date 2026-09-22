package DSA.LinkedList.questions;
//Leet code 2058
public class Q18_find_the_Minimum_and_Maximum_Number_of_Nodes_between_critical_points {
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        ListNode left = head;
        ListNode middle = head.next;
        ListNode right = head.next.next;
        int idx = 1;// 1 ko middle se chalu kar rahe hai startind middle se
        int []arr = {-1,-1};
        int first = -1,last = -1;
        int minDistance = Integer.MAX_VALUE;
        while(right!=null){
            if(middle.val>left.val && middle.val>right.val|| middle.val<left.val&&middle.val<right.val){
                if(first == -1) first = idx;
                if(last!=-1){
                    int dist = idx - last;
                    minDistance = Math.min(minDistance,dist);
                }
                last =idx;
            }
            idx++;
            left = left.next;
            right = right.next;
            middle = middle.next;
        }
        if(first == last) return arr;// 0 or 1 citical point
        int maxDistance = last - first;
        arr[0] = minDistance;
        arr[1] = maxDistance;
        return arr;
    }
    static void main(String[] args) {

    }
}
