package basics.oops.lvl4;
interface Playable{
    public void play();
}
class Guitar implements Playable{
    @Override
    public void play() {
        System.out.println("Played by guitarists");
    }

}
class Piano implements Playable{
    @Override
    public void play() {
        System.out.println("Played by piano players");
    }
}
public class prblm11 {
    public static void main(String[] args) {
        Guitar ins1= new Guitar();
        ins1.play();
        Piano ins2= new Piano();
        ins2.play();
    }
}
