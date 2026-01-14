package CollegeAssignments.Ass1;
import java.util.Scanner;
public class prblm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Find The Average of nos....");
        boolean ch=false;
        int[] arr = new int[1000];
        int i=0;
        while(ch==true){
            System.out.println("Enter the nos:");
            arr[i] = sc.nextInt();
            i++;
            ch=false;



        }
        for(int j=0;j<arr.length;j++){

            System.out.print(arr[j]+" ");


        }
    }
}
