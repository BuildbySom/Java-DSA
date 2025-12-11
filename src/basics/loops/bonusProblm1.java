package basics.loops;

import java.util.Scanner;

public class bonusProblm1 {
    public static void main(String[] args) {

        int sum=0;
        for (int i=1;i<=4;i++){
            for (int j=1;j<=i;j++){

                System.out.print(i);
                sum=sum+i;
            }
            System.out.println();
        }
        System.out.println("sum of above numbers: "+sum);
    }
}
