package basics.oops.level1;
import java.util.*;
class car{
    public String brand;
    public long price;
    Scanner sc=new Scanner(System.in);
    car(){
        System.out.println("Enter brand: ");
        brand = sc.nextLine();
        System.out.println("Enter price");
        price = sc.nextInt();
    }
    public void showDetails(){
        System.out.println("Brand : "+brand);
        System.out.println("price : "+price);
    }
}
public class prblm3 {
    public static void main(String[] args) {
        car car1=new car();
        car1.showDetails();;
    }
}
