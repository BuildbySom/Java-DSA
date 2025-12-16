package arrays;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows: ");
        int r= sc.nextInt();
        System.out.println("Enter no of columns: ");
        int c=sc.nextInt();
        int[][] marks= new int[r][c];
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.println("Enter the row:"+i+" col :"+j+" Element: ");
                marks[i][j]=sc.nextInt();
            }
        }
        for (int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(marks[i][j]+" ");

            }
            System.out.println();
        }

    }
}
