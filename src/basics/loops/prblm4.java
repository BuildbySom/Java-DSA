package basics.loops;

import java.util.Scanner;

public class prblm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N nos: ");
        int ch= sc.nextInt();
        int sum=0;
        for(int i=1;i<=ch;i++){
           sum += i*i*i*i*i;

        }
        System.out.println(sum);


    }
}
