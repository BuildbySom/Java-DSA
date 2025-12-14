package arrays;
import java.util.Scanner;
import java.lang.reflect.Array;

public class test {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int[] marks = new int[5];
        int user_input;
        for(int i=0;i<5;i++){
            System.out.println("Enter "+(i+1)+" Marks: ");
            user_input=sc.nextInt();
            marks[i]=user_input;

        }
        for(int i=0;i<5;i++){
            System.out.println((i+1)+" marks: "+marks[i]);

        }

    }
}
