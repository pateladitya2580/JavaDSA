package DSA.Heaps_and_Priority_Queue;

import java.awt.dnd.DragGestureEvent;
import java.util.Arrays;

class Student implements Comparable<Student>{
    int rno;
    double percentage;
    String name;
    Student(int rno,double percentage,String name){
        this.rno = rno;
        this.percentage = percentage;
        this.name = name;
    }
    public int compareTo(Student s){
        return this.rno - s.rno;//retun int hi hoga
    }
}
public class customComparator {
    public static void print (Student[] arr){
        for(int i = 0 ;i<arr.length;i++){
            System.out.print(arr[i].name+" ");
            System.out.print(arr[i].percentage+" ");
            System.out.println(arr[i].rno+" ");
        }
        System.out.println();
    }
    static void main(String[] args) {
        Student [] s = new Student[4];
        s[0] = new Student(76,89.5,"Raghav");
        s[1] = new Student(88,78.1,"Prachi");
        s[2] = new Student(13,95.8,"Aditya");
        s[3] = new Student(83,50.3,"Himanshu");
        print(s);
        Arrays.sort(s);
        print(s);
    }
}
