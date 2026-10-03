# ⚔️ Simulación de Combate de Personajes en Java (POO)

Este proyecto es una simulación orientada a objetos que modela una batalla por turnos entre personajes de un videojuego. Demuestra la interacción entre objetos de la misma clase, la alteración de atributos de estado (`vida`) y la validación de condiciones de derrota en memoria.

---

## 🧩 Clases y Estructura del Sistema

El programa está compuesto por 2 clases principales:

*   **`Personaje`**: Modela a un combatiente dentro del juego.
    *   **Atributos de estado:** `nombre`, `vida` (puntos de salud actuales) y `poderAtaque` (daño que inflije al oponente).
    *   **Métodos principales:**
        *   `atacar(Personaje oponente)`: Envía el daño del atacante al objetivo, siempre que el atacante siga con vida (`vida > 0`).
        *   `recibirDanio(int cantidad)`: Reduce la vida según el daño entrante, ajusta el límite a `0` si la salud cae por debajo de cero e imprime el estado actual.
*   **`Main`**: Instancia a dos personajes ("Guerrero" y "Mago") con atributos específicos y simula una secuencia de ataques entre ellos hasta que uno es derrotado.

---

## ⚙️ Lógica de Combate y Control de Salud

El sistema implementa reglas lógicas para gestionar la salud y prevenir acciones de entidades derrotadas:

1. **Mutación de Estado:** Cada vez que se ejecuta un ataque exitoso, se resta `poderAtaque` a la `vida` del objetivo.
2. **Normalización de Salud:** Si el daño recibido excede la vida restante, la salud se ajusta automáticamente a `0` (`if (vida < 0) vida = 0;`).
3. **Validación de Derrota:** Si un personaje intenta atacar o recibir daño con `vida <= 0`, el método bloquea la acción e informa por consola que el combatiente fue derrotado.

---

## 💻 Salida por Consola

Al ejecutar la clase `Main`, el programa genera el siguiente historial de combate:

```text
vida de Kael después del daño recibido: 75
vida de Aldric después del daño recibido: 85
vida de Kael después del daño recibido: 50
vida de Kael después del daño recibido: 25
vida de Aldric después del daño recibido: 70
vida de Aldric después del daño recibido: 55
vida de Kael después del daño recibido: 0
Kael no puede atacar porque fue derrotado.
Kael no puede recibir porque fue derrotado.
