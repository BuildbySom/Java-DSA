package CollegeAssignments.Ass1;
import java.util.Scanner;
public class prblm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find The Average of nos....");
        boolean ch=true;
        int[] arr = new int[8];
        System.out.println("Enter the nos:");
        int sum=0;
        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Array Elements:");
        for(int i=0;i<arr.length;i++) {

            System.out.print(arr[i]+" ");
        }
        System.out.println();
        double avg=(double)sum/8;
        System.out.println("Avg: "+avg);
    }

}

