package conflyweight;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class MainReal {

    private static final int TOTAL_GUNTERS = 100_000;
    private static final int LINEAS_DE_MUESTRA = 10;
    public static void main(String[] args) {
        Random random = new Random();
        FabricaGunter fabrica = new FabricaGunter();
        List<PosicionGunter> ejercito = new ArrayList<>(TOTAL_GUNTERS);

        long memoriaAntes = MemoryDisplayy.memoriaUsadaMB();

        for (int i = 0; i < TOTAL_GUNTERS; i++) {
            String tipo = (i % 2 == 0) ? "Normal" : "Con sombrero";
            int x = random.nextInt(1000);
            int y = random.nextInt(1000);
            Gunter gunter = fabrica.obtenerGunter(tipo);
            ejercito.add(new PosicionGunter(x, y, gunter));
        }

        for (int i = 0; i < ejercito.size(); i++) {
            if (i < LINEAS_DE_MUESTRA) {
                ejercito.get(i).activar();
            } else if (i == LINEAS_DE_MUESTRA) {
                System.out.println("...");
            }
        }

        long memoriaDespues = MemoryDisplayy.memoriaUsadaMB();

        System.out.println();
        System.out.println("Total de pingüinos simulados: " + TOTAL_GUNTERS);
        System.out.println("Total de objetos Flyweight (Gunter) creados: " + fabrica.cantidadCreada());
        System.out.println("Memoria antes (MB): " + memoriaAntes);
        System.out.println("Memoria después (MB): " + memoriaDespues);
        System.out.println("Memoria consumida (MB): " + (memoriaDespues - memoriaAntes));
    }
}
