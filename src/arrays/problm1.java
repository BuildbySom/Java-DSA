package arrays;

import java.util.Scanner;

public class problm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of Array: ");
        int size = sc.nextInt();
        int[] num = new int[size];
        for (int i=0;i<size;i++){
            System.out.println("Enter "+(i+1)+" no: ");
            int user_input=sc.nextInt();
            num[i]=user_input;
        }
        System.out.println("Enter the no to find: " );
        int search = sc.nextInt();
        boolean found=false;
        for (int i=0;i<size;i++){
            if (num[i]==search){
                System.out.println("Present on index: "+i);
                found = true;
                break;
            }


            }
        if (!found) {
            System.out.println("Not present..Try with another no");
        }
        for(int i=0;i<size;i++){
            System.out.println((i+1)+" element: "+num[i]);

        }
    }
}
