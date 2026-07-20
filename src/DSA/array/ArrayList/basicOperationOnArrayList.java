package DSA.array.ArrayList;

import java.util.ArrayList;

//ArrayList is a class in Java that implements a dynamic array. Unlike a regular array,
//an ArrayList can grow and shrink automatically as elements are added or removed.
public class basicOperationOnArrayList {
    static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();// small bracket me capacity de sakte hai
//        List<Integer> arr = new ArrayList<>();
        arr.add(0,10);
        arr.add(1,59);

        System.out.println(arr);// puri list print hogi

        System.out.println(arr.get(0));

        arr.set(0,56);
        System.out.println(arr.get(0));

        System.out.println(arr.size());

        arr.add(89);//push back
        System.out.println(arr);

        //arr.remove() isme index dalo uska or wo element delete
      }
}
