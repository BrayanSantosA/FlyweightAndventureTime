package sinflyweight;

/**
 * Versión SIN Flyweight: cada instancia guarda tanto el estado
 * intrínseco (tipo, sonido) como el extrínseco (x, y). No hay pool
 * ni reutilización: cada pingüino simulado es un objeto 100%
 * independiente, aunque su tipo y sonido se repitan miles de veces.
 */
public class GunterCompleto {

    private final String tipo;
    private final String sonido;
    private final int x;
    private final int y;

    public GunterCompleto(String tipo, String sonido, int x, int y) {
        this.tipo = tipo;
        this.sonido = sonido;
        this.x = x;
        this.y = y;
    }

    public void hacerSonido() {
        System.out.println(sonido + "! Gunter " + tipo + " en posición (" + x + ", " + y + ")");
    }
}
