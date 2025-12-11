package basics.loops;

public class prblm8 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1;i<=5;i++){
            for (int j=1;j<=i;j++){
                System.out.print("+ ");
                sum++;

            }
            System.out.println();
        }
        System.out.println("Sum of the Numbers shown in pattern :"+sum);
    }
}
