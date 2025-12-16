package arrays._2D;

import java.util.Scanner;

public class prblm1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter no of columns: ");
        int c = sc.nextInt();
        int[][] numbers = new int[r][c];
        for (int i=0;i<r;i++){
            System.out.println("Enter "+c+" values of row "+(i+1)+" : ");
            for (int j=0;j<c;j++){
                numbers[i][j]=sc.nextInt();

            }
        }

        System.out.println("Matrix: ");
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                System.out.print(numbers[i][j]+" ");

            }
            System.out.println();
        }
        System.out.println("enter the no to find: ");
        int search=sc.nextInt();
        boolean found=false;
        for (int i=0;i<r;i++){
            for (int j=0;j<c;j++){
                if (numbers[i][j]==search){
                    System.out.println("The number found at index: "+i+","+j);
                    found=true;
                    break;
                }

            }
            if (found){
                break;
            }

        }
        if(!found){
            System.out.println("The no not found trywith another no....");

        }


    }
}
