package arrays;

public class problm5 {
    public static void main(String[] args) {
        int[] arr= {9,3,7,1,5};
        boolean assending=true;
        boolean desending=true;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<arr[i+1]){
                decending=false;
            }
            if (arr[i]>arr[i+1]){
                assending=false;
            }

        }
        if (assending){
            System.out.println("Assending order");
        } else if (desending) {
            System.out.println("Decending order");

        }
        else {
            System.out.println("no order");
        }

    }
}
