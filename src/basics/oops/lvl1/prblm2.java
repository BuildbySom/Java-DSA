package basics.oops.lvl1;
class rectange{
    public double length;
    public double breadth;

    public void area(int length,int breadth){
        this.length=length;
        this.breadth=breadth;
        System.out.println("Area of Rectangle: "+length*breadth);

    }


}
public class prblm2 {
    public static void main(String[] args) {
        rectange newREc= new rectange();
        newREc.area(10,62);
    }

}
