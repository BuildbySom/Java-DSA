package basics.loops;
import java.util.Scanner;
public class prblm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The N natural nos: ");
        int ch= sc.nextInt();
        int add=0;
        for (int i=1;i<=ch;i++){
            add+=i;
        }
        System.out.println("The Sum of First "+ch+" Natural Nos: "+add);
    }
}
