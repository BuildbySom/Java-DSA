package CollegeAssignments.Ass2;

import java.util.Scanner;

//fibonacci series till n
public class prblm3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int user_input= sc.nextInt();
        int a = 0;
        int b = 1;
        int temp;
        System.out.println(a);
        System.out.println(b);
        //System.out.println(temp);
        for(int i = 0;i<user_input-2;i++){
            temp = a+b;
            System.out.println(temp);
            a= b;
            b= temp;

        }

    }
}
