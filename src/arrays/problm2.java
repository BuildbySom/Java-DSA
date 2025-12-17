package arrays;

import java.util.Scanner;

public class problm2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array size: ");
        int arr_size=sc.nextInt();
        int[] num = new int[arr_size];
        System.out.println("Enter "+num.length+" Elements: ");
        for (int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }

        for(int i=0;i<num.length;i++){

            System.out.print(num[i]+" ");


        }
        System.out.println();
        //sum of all the elements:
        int sum=0;
        for (int i=0;i<num.length;i++){
            sum+=num[i];
        }
        System.out.println("Sum of all the elements in the array: "+sum);
        //maximum element in the array:
        int max=num[0];
        for (int i =1;i<num.length;i++){
            if (num[i]>max){
                max=num[i];
            }

        }

        System.out.println("The Maximum no in array: "+max);
        //minimum number :
        int min=num[0];
        for (int i=0;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("The Minimum no in array: "+min);
        int oddCount=0;
        int eveCount=0;
        for(int i=0;i<num.length;i++){
            if(num[i]%2==0){
                eveCount++;
            }
            else {
                oddCount++;
            }
        }
        System.out.println("No of odd numbers in array: "+oddCount);
        System.out.println("No of even numbers in array: "+eveCount);

        //searching:
        System.out.println("Enter The No to Find : ");
        int sno=sc.nextInt();
        boolean search=false;
        for (int i=0;i<num.length;i++){
            if (num[i]==sno){
                System.out.println("Number found at index:"+i);
                search=true;
                break;
            }
        }
        if (!search){
            System.out.println("Not found ...");
        }






    }
}
