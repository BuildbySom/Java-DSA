package basics.loops;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class prblm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The no: ");
        int ch= sc.nextInt();
        int temp=ch;


        int add=0;
        while(temp>0){
            int rem=temp%10;
            add = rem+add;
            temp = temp/10;
            System.out.println(temp);

        }
        System.out.println(add);
    }


}
