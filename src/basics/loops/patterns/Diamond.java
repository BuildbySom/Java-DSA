package basics.loops.patterns;

public class Diamond {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 5; j++) {
                if (i==1 && j!=3){
                    System.out.print("  ");
                }
                else if (i == 2 && (j < 2 || j > 4)) {
                    System.out.print("  ");
                }
                else {
                    System.out.print("@ ");
                }

            }
            System.out.println();

        }
        for (int x=1;x<=2;x++){
            for (int y=1;y<=5;y++){
                if (x==1 &&(y<2 || y>4)){
                    System.out.print("  ");
                }
                else if (x==2 && y!=3){
                    System.out.print("  ");
                }
                else {
                    System.out.print("@ ");
                }
            }
            System.out.println();
        }
    }
}
