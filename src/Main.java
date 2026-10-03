public class Main {
    public static void main(String[] args) {
        Personaje Guerrero = new Personaje("Aldric",100,25);

        Personaje Mago = new Personaje("Kael",100,15);

        Guerrero.atacar(Mago);
        Mago.atacar(Guerrero);
        Guerrero.atacar(Mago);
        Guerrero.atacar(Mago);
        Mago.atacar(Guerrero);
        Mago.atacar(Guerrero);
        Guerrero.atacar(Mago);
        Guerrero.atacar(Mago);
        Mago.atacar(Guerrero);

    }
}