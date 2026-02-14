package CollegeAssignments.Ass1;

import java.util.Scanner;

//leap year
public class problm4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year:");
        int yr=sc.nextInt();
        if(yr%4==0 || yr%400==0){
            System.out.println(yr + " Is a leap year");
        }
        else{
            System.out.println("Not a leap year...");
        }
    }
}
