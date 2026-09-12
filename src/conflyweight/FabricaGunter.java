package conflyweight;

import java.util.HashMap;
import java.util.Map;


public class FabricaGunter {

    private final Map<String, Gunter> pool = new HashMap<>();

    public Gunter obtenerGunter(String tipo) {
        Gunter gunter = pool.get(tipo);
        if (gunter == null) {
            gunter = new Gunter(tipo, "Wenk");
            pool.put(tipo, gunter);
            System.out.println("[Fábrica] Nuevo Flyweight creado para el tipo: " + tipo);
        }
        return gunter;
    }

    public int cantidadCreada() {
        return pool.size();
    }
}
