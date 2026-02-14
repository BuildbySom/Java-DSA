package CollegeAssignments.Ass1;

import java.util.Scanner;

//area & perimeter of  rectangle
class Rectangle{
    private double width,height;
    public void area(double w,double h){
        this.width=w;
        this.height=h;
        double area= w*h;
        System.out.println("Area of Rectangle: "+area);
    }
    public void perimeter(double w,double h){
        this.width=w;
        this.height=h;
        double perimeter= 2*(w+h);
        System.out.println("Perimeter of Rectangle: "+perimeter);
    }


}
public class prblm3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Width:");
        double w=sc.nextDouble();
        System.out.println("Enter the Hight:");
        double h=sc.nextDouble();
        Rectangle r1=new Rectangle();
        r1.area(w,h);
        r1.perimeter(w,h);
    }
}
