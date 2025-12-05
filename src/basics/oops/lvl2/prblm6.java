package basics.oops.lvl2;
import java.util.*;
class bankAcc{
    private int accNo;
    long bal=0;
    Scanner sc = new Scanner(System.in);
    public void setAccNo(int accNo){
        this.accNo=accNo;
    }
    public void getAccNo(){
        System.out.println(accNo);
    }
    public void deposit(){
        System.out.println();
        System.out.print("Enter account no: ");
        int tempAccNo= sc.nextInt();
        System.out.println();
        if (accNo==tempAccNo){
            System.out.print("Enter Deposit Amount: ");
            int depAmt=sc.nextInt();
            bal=bal+depAmt;
            System.out.println("SucessFully Deposited");
            System.out.print("Current Balance: "+bal);
        }
        else{
            System.out.println("Wrong Account no");
        }
    }
    public void withdraw(){
        System.out.println();
        System.out.print("Enter account no: ");
        int tempAccNo= sc.nextInt();
        System.out.println();
        if (accNo==tempAccNo){
            System.out.print("Enter Withdraw Amount: ");
            int wdAmt=sc.nextInt();
            if(bal<wdAmt){
                System.out.println("Not Enough Balance");
            }
            else{
                bal=bal-wdAmt;
                System.out.println("Sucessfully withdrawn");
                System.out.print("Remaining Balance: "+bal);
            }
        }
        else{
            System.out.println("Wrong Account no");
        }

    }
    public void checkBal(){
        System.out.println();
        System.out.print("Enter account no: ");
        int tempAccNo= sc.nextInt();
        System.out.println();
        if (accNo==tempAccNo){
            System.out.print("Balance: "+bal);

        }
        else{
            System.out.println("Wrong Account no");
        }

    }
}
public class prblm6 {
    public static void main(String[] args) {
        bankAcc user1= new bankAcc();
        user1.setAccNo(123456);
        user1.getAccNo();
        user1.deposit();
        user1.withdraw();
        user1.checkBal();

    }
}
