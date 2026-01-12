package basics.Multithreading.tutorial;
class myThread1 extends Thread{
    public void run(){
        for(int i=0; i<1000 ;i++){
            System.out.println("I am watching a movie");
            System.out.println("I m thrilled");
        }
    }
}

class myThread2 extends Thread{
    public void run(){
        for(int i=0; i<1000 ;i++){
            System.out.println("I am scrolling insta");
            System.out.println("I m bored");
        }
    }
}
public class test1 {
    public static void main(String[] args) {
        myThread1 t1 = new myThread1();
        myThread2 t2 = new myThread2();
        t1.start();
        t2.start();

    }
}
