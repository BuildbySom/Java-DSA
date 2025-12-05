package basics.oops.lvl2;
class calculator{
    public double a,b,c;
    public int add(int a,int b){
        this.a=a;
        this.b=b;
        return a+b;
    }
    public double add(double a,double b){
        this.a = a;
        this.b=b;
        return a+b;
    }
    public int add(int a,int b,int c){
        this.a=a;
        this.b=b;
        this.c=c;
        return a+b+c;
    }

}
public class prblm4 {
    public static void main(String[] args) {
        calculator cal1= new calculator();
        System.out.println(cal1.add(5,6));
        System.out.println(cal1.add(5.32,89.56));
        System.out.println(cal1.add(2,6,78));

    }
}
