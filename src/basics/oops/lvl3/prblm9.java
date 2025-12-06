package basics.oops.lvl3;
class Shape{
    public void area(int num){
        System.out.println("this method finds area");
    }
}
class Circle extends Shape{
    int radius;
    @Override
    public void area(int radius) {
        this.radius=radius;
        System.out.println("Area of Circle: "+3.14*(radius*radius));
    }
}
class Square extends Shape{
    int side;
    public void area(int side){
        this.side=side;
        System.out.println("Area of Square: "+side*side);
    }
}
public class prblm9 {
    public static void main(String[] args) {
        Circle c1= new Circle();
        c1.area(12);
        Square s1 = new Square();
        s1.area(12);

    }
}
