package basics.CollectionFramework.arrayList;
import java.util.ArrayList;
import java.util.Scanner;

public class prblm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list =new ArrayList<>();
        System.out.println("Enter no of elements to be inserted: ");
        int ch= sc.nextInt();
        for(int x=1;x<=ch;x++){
            System.out.println("Enter "+ x +" Number: ");
            int user_input = sc.nextInt();
            list.add(user_input);
        }
        System.out.println(list);
        int max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }

        }
        System.out.println("The maximum no: "+max);
        int max2=0;
        for (int j=0;j<list.size();j++){
            if(list.get(j)>max2 && list.get(j)!=max){
                max2 =list.get(j);
            }
        }
        System.out.println("Second Maximum no.: "+max2);
    }
}
