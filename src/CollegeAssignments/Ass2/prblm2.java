package CollegeAssignments.Ass2;
import java.util.Scanner;

public class prblm2 {
    public static void factorial(int n){
        int fac =1;
        for(int i=1;i<=n;i++){
            fac*=i;
        }
        System.out.println("Factorial: "+fac);
    }
    public static void main(String[] args) {
        System.out.println("Calculating Factorial...");
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        int user_input= sc.nextInt();
        factorial(user_input);
    }
}
