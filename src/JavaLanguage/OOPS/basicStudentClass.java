package JavaLanguage.OOPS;

import java.util.Scanner;

public class basicStudentClass {
    public static class Student{
        String name;
        int roll;
        double cgpa;
        void print(){
            System.out.println(name+" "+roll+" "+cgpa);
        }
    }
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        System.out.println("Enter the name ");
        s1.name = sc.nextLine();
        System.out.println("Enter the roll");
        s1.roll = sc.nextInt();
        s1.print();
    }
}
