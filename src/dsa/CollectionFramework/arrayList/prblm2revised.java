package dsa.CollectionFramework.arrayList;
import java.util.Scanner;
import java.util.ArrayList;


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
        int max=list.get(0);
        for(int j=1;j<list.size();j++){
            if(list.get(j)>max){
                max=list.get(j);
            }
        }
        System.out.println("Maximum Value in list: "+max);
        //Finding 2nd maximum:
        Integer max2= null;
        for (int k=0;k< list.size();k++){
            int val= list.get(k);
            if (val==max){
                continue;
            }
            if (max2==null || val>max2){
                max2=val;

            }
        }
        if (max2==null){
            System.out.println("2nd max not exist..");
        }
        else{
            System.out.println("2nd max: "+max2);
        }
        //Finding 3rd max Value
        Integer max3=null;
        for (int l=0;l<list.size();l++){
            int num=list.get(l);
            if(num==max || num==max2){
                continue;
            }
            if (max3==null || num>max3){
                max3=num;
            }
        }
        if (max3==null){
            System.out.println("3rd maximum no. doesnot exist..");
        }
        else {
            System.out.println("3rd maimum no. : "+max3);
        }







    }
}
