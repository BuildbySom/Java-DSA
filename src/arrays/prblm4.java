package arrays;

import java.util.Scanner;

public class prblm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        System.out.println("Enter "+size+" numbers: ");
        for (int i=0;i<size;i++){
            num[i]=sc.nextInt();

        }
        System.out.println("The array: ");
        for (int i=0;i<size;i++){
            System.out.print(num[i]+" ");

        }
        System.out.println();
        int sum=0;
        int avg;
        for (int i=0;i<num.length;i++){
            sum+=num[i];

        }
        System.out.println("The sum of array elements: "+sum);
        avg=sum/num.length;
        System.out.println("The average of the array elements: "+avg);
    }
}
