package arrays;

import java.util.Scanner;

public class prblm5_Revised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int arr_size=sc.nextInt();
        int[] arr = new int[arr_size];
        System.out.println("Enter "+arr.length+" Elements: ");
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");


        }
        System.out.println();
        boolean as = true;
        boolean des = true;

        for (int i=0;i<arr.length-1;i++){
            if (arr[i]>arr[i+1]){
                as = false;

            }
            if (arr[i]<arr[i+1]){
                des =false;
            }
        }

        if (as){
            System.out.println("The array elements are in assending..");
        }
        else if (des){
            System.out.println("The array elements are in desending..");
        }
        else {
            System.out.println("The array elements have no order....");
        }


    }

}
