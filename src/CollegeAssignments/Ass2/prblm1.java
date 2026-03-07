package CollegeAssignments.Ass2;

import java.util.Scanner;

public class prblm1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Earning: ");
        int earn = sc.nextInt();
        int tax=0,extra=0;

        if(earn<=50000){
            System.out.println("No income tax.. ");
        }
        else if(earn>50000 && earn<=60000){
            extra= earn-50000;
            tax+=extra*10/100;

        }
        else if(earn>60000 && earn<=150000){
            extra = earn-60000;
            tax+=extra*10/100;
        }
        else{
            extra = earn-150000;
            tax+=extra*10/100;
        }


        System.out.println("Income Tax is: "+ tax);
    }
}
