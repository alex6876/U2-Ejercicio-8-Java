public class Personaje {
    String nombre;
    int vida;
    int poderAtaque;

    public Personaje(String nombre, int vida, int poderAtaque) {
        this.nombre = nombre;
        this.vida = vida;
        this.poderAtaque = poderAtaque;
    }

    public void atacar(Personaje oponente){
        if(vida <= 0){
            System.out.println(nombre+" no puede atacar porque fue derrotado.");
        }else{
            oponente.recibirDanio(poderAtaque);
        }

    }

    public void recibirDanio(int cantidad){
        if(vida <= 0){
            System.out.println(nombre+" no puede recibir porque fue derrotado.");
        }else {
            vida -= cantidad;

            if (vida < 0){
                vida = 0;
            }

            System.out.println("vida de "+ nombre+ " después del daño recibido: " + vida);
        }

    }
}
