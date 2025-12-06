package basics.oops.lvl3;
abstract class animal{
    abstract void sound();


}
class Dog extends animal{
    public void sound(){
        System.out.println("Barkkkkkkkk");
    }
}
class Cat extends animal{
    public void sound(){
        System.out.println("Mewwwwwwoowww");
    }
}

public class prblm7 {
    public static void main(String[] args) {
        Dog d1= new Dog();
        d1.sound();
        Cat c1= new Cat();
        c1.sound();
    }
}
