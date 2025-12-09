package dsa.CollectionFramework.arrayList;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class prblm2revised {
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
        System.out.println();

        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        System.out.println("Max value int list: " + max);
        Integer max2 = null;

        for (int j = 0; j < list.size(); j++) {
            int val = list.get(j);
            if (val != max) {     // must exclude max
                if (max2 == null || val > max2) {
                    max2 = val;
                }
            }
        }

        System.out.println("Max value in list: " + max);

        if (max2 == null) {
            System.out.println("Second max does NOT exist.");
        } else {
            System.out.println("2nd Max value in list: " + max2);
        }
    }
}
