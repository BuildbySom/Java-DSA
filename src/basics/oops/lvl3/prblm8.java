package basics.oops.lvl3;
class vehicle{
    vehicle(){
        System.out.println("Vehicle Created");
    }
}
class car extends vehicle{
    car(){
        super();
        System.out.println("car Created");
    }
}
public class prblm8 {
    public static void main(String[] args) {
        car c1= new car();
    }
}
