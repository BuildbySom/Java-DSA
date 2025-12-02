package basics.oops;
class pet{
    void dog(){
        System.out.println("Dog is a loyal pet");
    }
}
class animal extends pet{
    void domestic(){
        System.out.println("Dog is a domestic animal");
    }
}


public class singleInheritence1 {
    public static void main(String[] args) {
        animal a1= new animal();
        a1.domestic();
        a1.dog();
    }
}
