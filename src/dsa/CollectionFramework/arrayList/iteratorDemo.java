package dsa.CollectionFramework.arrayList;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;

public class iteratorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Enter the no of elements to be inserted: ");
        int ch = sc.nextInt();
        for (int i = 1; i <= ch; i++) {
            System.out.println("Enter " + i + " No.: ");
            int num = sc.nextInt();
            list.add(num);
        }
        System.out.println("The List : " + list);
        for (int j : list){
            System.out.println(j);
        }
    }
}
