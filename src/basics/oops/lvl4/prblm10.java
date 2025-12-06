package basics.oops.lvl4;

import java.sql.SQLOutput;

abstract class Phone{
    String brand;
    abstract void features();
    public void brand(String brand){
        this.brand=brand;
        System.out.println(brand);
    }

}
class Android extends Phone{
    @Override
    void features() {
        System.out.println("Sanpdragon Processor, Expandable Storage,16gb Ram");
    }

}
class iPhone extends Phone{
    @Override
    void features() {
        System.out.println("M2 chip Processor,1tb Storage, High Quality Camera,High Sequrity");
    }
}
public class prblm10 {
    public static void main(String[] args) {
        Android ph1= new Android();
        ph1.brand("Samsung--->");
        ph1.features();
        iPhone p2= new iPhone();
        p2.brand("iPhone--->");
        p2.features();
    }
}
