package basics.oops.lvl4;

class Circle extends basics.oops.lvl3.Shape {
    int radius;
    @Override
    public void area(int radius) {
        this.radius=radius;
        System.out.println("Area of Circle: "+3.14*(radius*radius));
    }
}
class Square extends basics.oops.lvl3.Shape {
    int side;
    public void area(int side){
        this.side=side;
        System.out.println("Area of Square: "+side*side);
    }
}


public class prblm12 {
    public static void main(String[] args) {
        basics.oops.lvl3.Shape s;
        s = new Circle();
        s.area(12);
        s = new Square();
        s.area(12);
    }
}

