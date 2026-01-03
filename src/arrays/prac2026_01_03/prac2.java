package arrays.prac2026_01_03;

import java.util.Scanner;

public class prac2 {
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
        for (int i=0;i<siz;i++){
            for(int j=0;j<siz;j++){
                if (arr[i]==arr[j]){
                    System.out.println();
                }
                else {
                    System.out.println(arr[i]);
                    break;
                }

            }

        }

    }
}
//array ele-6 -[1 1 3 2 6 6]
//output- 3