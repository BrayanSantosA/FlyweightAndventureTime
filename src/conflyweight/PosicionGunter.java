package conflyweight;

public class PosicionGunter {

    private final int x;
    private final int y;
    private final Gunter gunter;

    public PosicionGunter(int x, int y, Gunter gunter) {
        this.x = x;
        this.y = y;
        this.gunter = gunter;
    }


    public void activar() {
        gunter.hacerSonido(x, y);
    }
}
