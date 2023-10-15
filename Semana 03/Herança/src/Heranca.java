import animais.Animal;
import animais.Cachorro;
import animais.Galinha;
import animais.Gato;

public class Heranca {
    public static void main(String[] args) throws Exception {
        Animal animal = new Animal("Jacaré");
        animal.comer();
        System.out.println(animal.getNome());

        Cachorro cachorro = new Cachorro("Rex");
        cachorro.comer();
        cachorro.beber();
        cachorro.latir();

        Gato gato = new Gato("Romeu");
        gato.comer();
        gato.beber();

        Galinha galinha = new Galinha("Little Chicken");
        galinha.comer();
        galinha.beber();
        galinha.botarOvo();
    }
}
