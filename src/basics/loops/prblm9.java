package basics.loops;

import java.util.Scanner;

public class prblm9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N nos: ");
        int ch= sc.nextInt();
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.print(ch*i+" ");
            sum+=ch*i;
        }
        System.out.println();
        System.out.println("Total of all above nos: "+sum);
    }
}
