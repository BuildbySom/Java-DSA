package arrays;
import java.util.Scanner;
import java.lang.reflect.Array;

public class test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] marks = new int[5];
        int[] freg= new int[1000];
        int user_input;
        System.out.println("Enter "+5+" Marks: ");

        for(int i=0;i<5;i++){
            marks[i]=sc.nextInt();


        }
        for(int i=0;i<5;i++){
            System.out.print(" "+marks[i]);

        }
        System.out.println(marks.length);
        for(int i=0;i<5;i++){
            freg[marks[i]]++;

        }
        System.out.println("FreQuency: ");
        for(int i=0;i<10;i++){
            System.out.print(" "+freg[i]);

        }
        System.out.println();
        System.out.println(freg[marks[4]]);

    }
}
