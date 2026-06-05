package JavaLanguage.conditionals;

import java.util.Scanner;

public class gradeOfStudent {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mark = sc.nextInt();
        if(mark >= 81 )
        {
            System.out.println("very good");
        } else if (mark>=61 ) {
            System.out.println("good");
        } else if (mark>= 41 ) {
            System.out.println("Average");
        }
        else{
            System.out.println("fail");
        }
    }
}
