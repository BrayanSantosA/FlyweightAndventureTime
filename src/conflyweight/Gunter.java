package conflyweight;

public class Gunter {

    private final String tipo;
    private final String sonido;

    public Gunter(String tipo, String sonido) {
        this.tipo = tipo;
        this.sonido = sonido;
    }


    public void hacerSonido(int x, int y) {
        System.out.println(sonido + "! Gunter " + tipo + " en posición (" + x + ", " + y + ")");
    }

    public String getTipo() {
        return tipo;
    }
}
