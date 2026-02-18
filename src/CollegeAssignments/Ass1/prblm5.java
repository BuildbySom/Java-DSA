package CollegeAssignments.Ass1;

import java.util.Scanner;

//Largest among 3 numbers:
class max{
    private int a,b,c;
    public void greatest(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        if(a==b && b==c && c==a){
            System.out.println("Numbers are not Distinct..");
        }
        else{
            if(a>b && a>c){
                System.out.println(a+" is Greatest");
            }
            if(b>a && b>c){
                System.out.println(b+" is the Greatest");
            }
            if(c>a && c>b){
                System.out.println(c+" is the greatest");
            }

        }
    }
}
public class prblm5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 nos: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        max m1 = new max();
        m1.greatest(a,b,c);

    }
    }

