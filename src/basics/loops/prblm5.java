package basics.loops;

import java.util.Scanner;

public class prblm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N nos: ");
        int ch= sc.nextInt();
        int sum=0;
        System.out.println("The odd nos:");
        for (int i=1;i<=ch;i++){
            if (i%2!=0){
                sum+=i;
                System.out.println(i);

            }
        }
        System.out.println("Sum of odd numbers: "+sum);
    }
}
