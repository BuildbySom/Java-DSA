package arrays;

import java.util.Scanner;

public class prblm3 {
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
        int zer=0;
        int neg=0;
        int pos=0;
        for (int i=0;i<num.length;i++){
            if(num[i]<0){
                neg++;
            }
            if (num[i]>0){
                pos++;
            }
            if (num[i]==0){
                zer++;
            }
        }
        System.out.println("THE number of zero in the array: "+zer);
        System.out.println("THE number of positive in the array: "+pos);
        System.out.println("THE number of negative in the array: "+neg);

    }
}
