package arrays.prac2026_01_03;
import java.util.Scanner;

public class prac1 {
    public static void main(String[] args) {
        int siz;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of Array: ");
        siz= sc.nextInt();
        int[] arr= new int[siz];
        System.out.println("Enter "+siz+" Elements :");

        for(int i=0;i<siz;i++){
            int inp= sc.nextInt();
            arr[i]=inp;
        }
        System.out.println(" The array elements: ");
        for(int i=0;i<siz;i++){
            System.out.print(" "+arr[i]);

        }
        System.out.println();
        boolean assending = true;
        boolean dessending = true;
        for(int i=0;i<siz-1;i++){
            if(arr[i]>arr[i+1]){
                assending=false;
            }
            if(arr[i]<arr[i+1]){
                dessending=false;
            }
        }
        if(assending){
            System.out.println("Array is in assending order..");
        }
        else if(dessending){
            System.out.println("Array is in dessending order..");

        }
        else{
            System.out.println("This array is unordered");
        }



    }
}
