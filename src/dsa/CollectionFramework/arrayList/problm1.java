package dsa.CollectionFramework.arrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class problm1 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=10;i++){
            System.out.println("Enter "+ i +" Number: ");
            int user_input = sc.nextInt();
            list.add(user_input);
        }
        System.out.println(list);
        System.out.println("The List elements grater then 50: ");
        for (int j=0;j<list.size();j++){
            if(list.get(j)>50){
                System.out.println(list.get(j));

            }
        }

    }
}
