package basics.loops;

import java.util.Scanner;

public class bonusPrblm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N nos: ");
        int ch= sc.nextInt();
        int sum=0;
        for (int i=1;i<=ch;i++){
            if (i%2==0){
                sum-=i;
            }
            else{
                sum+=i;
            }
        }
        System.out.println("The sum of alternating series: "+sum);
    }
}
