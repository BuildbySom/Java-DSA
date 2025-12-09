package dsa.CollectionFramework.arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class prblm1revised {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the no of elements to be inserted: ");
        int ch=sc.nextInt();
        for(int i=1;i<=ch;i++){
            System.out.println("Enter "+i+" No.: ");
            int num=sc.nextInt();
            list.add(num);
        }
        System.out.println("The List : "+list);
        System.out.println();
        System.out.println("The elements greater then 50: ");
        for (int j=0;j<list.size();j++){
            if (list.get(j)>50){
                System.out.println(list.get(j));
            }
        }
    }
}
