# El Ejército de Gunters del Rey Helado — Patrón Flyweight

Taller de Modelos de Programación: simular la creación de 100 000 pingüinos
Gunter (solo 2 variantes: Normal y Con sombrero de mago) usando el
patrón *Flyweight*, y comparar el resultado contra una versión sin el
patrón.

## Diagrama UML Con Flyweight y sin Flyweight
<img width="1232" height="640" alt="image" src="https://github.com/user-attachments/assets/bb02d21c-84f4-4d86-b7d2-bbcbcf42cc90" />


## Cómo compilar y ejecutar

```bash
cd src
javac -encoding UTF-8 conflyweight/*.java sinflyweight/*.java

java conflyweight.Main
java sinflyweight.Main
```

Cada `Main` imprime una muestra de 10 líneas (para no saturar la consola con
100 000 líneas), y al final reporta:

- Total de pingüinos simulados
- Total de objetos "pesados" creados realmente (Flyweight, o
  GunterCompleto en la versión sin el patrón)
- Memoria usada antes y después, medida con `MemoryDisplay`
