package arrays._2D;

import java.util.Scanner;

class reverseArray{
    public void reverse(int[] arr){
        int i = 0, j = arr.length-1;
        int temp;
        while(i<j){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }
}
public class reverse_array_revised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int arr_size=sc.nextInt();
        int[] num = new int[arr_size];
        System.out.println("Enter "+num.length+" Elements: ");
        for (int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        for(int i=0;i<num.length;i++){

            System.out.print(num[i]+" ");


        }
        System.out.println();
        System.out.println("Reversed array:");
        reverseArray re = new reverseArray();
        re.reverse(num);
        for(int i=0;i<num.length;i++){

            System.out.print(num[i]+" ");


        }
        System.out.println();
    }
}
