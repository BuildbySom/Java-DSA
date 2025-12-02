package basics.oops;
//since java doesnot support multiple inheritance its uses interfaces
interface pets{
    public void dog();
}
interface wildAnimals{
    public void lion();
}
class wildlife implements pets,wildAnimals{
    public void lion(){
        System.out.println("Eats only meat");
    }
    public void dog(){
        System.out.println("Eats varity of foods");
    }
}
public class multipleInheritance {
    public static void main(String[] args) {
        wildlife w1 = new wildlife();
        w1.dog();
        w1.lion();

    }

}
