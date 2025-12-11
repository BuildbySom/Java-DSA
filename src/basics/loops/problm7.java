package basics.loops;

public class problm7 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=5;i>=1;i--){
            for (int j=i;j>=1;j--){
                System.out.print(j);
                sum = sum+j;

            }
            System.out.println();
        }
        System.out.println("Sum of numbers in pattern: "+sum);
    }
}
