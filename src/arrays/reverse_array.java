package arrays;

import java.util.Scanner;
class reverseArray {
    public void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        int t;
        while (i < j) {
            t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++;
            j--;
        }
        for (int x = 0; x < arr.length; x++) {

            System.out.print(arr[x] + " ");
        }

    }}
    public class reverse_array {
        public static void main(String[] args) {
            reverseArray ar = new reverseArray();
            Scanner sc = new Scanner(System.in);
            System.out.println("enter array size: ");
            int arr_size = sc.nextInt();
            int[] num = new int[arr_size];
            System.out.println("Enter " + num.length + " Elements: ");
            for (int i = 0; i < num.length; i++) {
                num[i] = sc.nextInt();
            }

            for (int i = 0; i < num.length; i++) {

                System.out.print(num[i] + " ");


            }
            System.out.println();

            ar.reverse(num);


            }


        }



