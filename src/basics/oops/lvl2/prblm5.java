package basics.oops.lvl2;
class emp{
    private String name;
    private int salary;
    public void setDetails(String name,int salary){
        this.name=name;
        this.salary=salary;

    }
    public void getDetails(){
        System.out.println(name);
        System.out.println(salary);

    }
}
public class prblm5 {
    public static void main(String[] args) {
        emp emp1=new emp();
        emp1.setDetails("Soumya",1000000);
        emp1.getDetails();


    }
}
