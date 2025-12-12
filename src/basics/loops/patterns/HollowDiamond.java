package basics.loops.patterns;

public class HollowDiamond {
    public static void main(String[] args) {
        for (int i=1;i<=5;i++){
            for (int j=1;j<=5;j++) {
                if(j==3 &&(i==1 || i==5)){
                    System.out.print("* ");
                }
                else if(i==3 &&(j==1 || j==5)){
                    System.out.print("* ");
                }
                else if ((i==2 && j==2)||(i==4 && j==4)){
                    System.out.print("* ");
                }
                else if ((i==2 && j==4)||(i==4 && j==2)){
                    System.out.print("* ");
                }
                else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
