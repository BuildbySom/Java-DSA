package basics.loops;
import java.util.Scanner;
public class prblm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N even nos: ");
        int ch= sc.nextInt();
        int add=0;
        System.out.println("Even Nos:");
        for (int i=2;i<=ch;i++){
            if (i%2==0){
                add+=i;
                System.out.println(i);
            }
        }
        System.out.println("Sum of even Nos up to "+ch+": "+add);
    }
}
