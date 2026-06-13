package JavaLanguage.patternPrinting.specialPatterrn;

import java.util.Scanner;

public class oddNoTriangle {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n ");
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            for(int j = 1;j<=i ;j++){
                System.out.print(2*j-1 +" ");
            }
            System.out.println();
        }

//        for(int i = 1;i<=n;i++){
//            int a= 1;
//            for(int j = 1;j<=i ;j++){
//                System.out.print(a +" "); second method
//                a += 2;
//            }
//            System.out.println();
//        }

//        for(int i = 1;i<=n;i++){
//            for(int j = 1;j<=2*i-1 ;j+=2){ third method
//                System.out.print(j+" ");
//            }
//            System.out.println();
//        }
    }
}
