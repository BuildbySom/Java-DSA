package basics.oops.level1;
class student{
    public String name;
    public int age;
    student(int age,String name){
        this.age=age;
        this.name=name;
    }
    public void display(){
        System.out.println(age);
        System.out.println(name);
    }
}
public class problm1 {
    public static void main(String[] args) {
        student s1=new student(18,"Soumya");
        s1.display();

    }
}
