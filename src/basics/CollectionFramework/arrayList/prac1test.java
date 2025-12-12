package basics.CollectionFramework.arrayList;
import java.util.ArrayList;
import java.util.Collections;

public class prac1test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        //add elements;
        list.add(0);
        list.add(1);
        list.add(3);
        System.out.println(list);
        //to get element using index
        System.out.println(list.get(2));
        //to add element using index in between or anywhere
        list.add(1,2);
        System.out.println(list);
        //to set element (to replace any element)
        list.set(0,1);
        System.out.println(list);

        //delete element
        list.remove(2);
        System.out.println(list);

        //to see the size of list
        System.out.println(list.size());

        //sorting
        list.add(0,7);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

    }
}
