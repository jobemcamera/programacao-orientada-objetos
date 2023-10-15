import jogo.Mago;

public class PersonagemMain {
  public static void main(String[] args) throws Exception {

    Mago mago1 = new Mago("Gandalf");
    System.out.println(mago1);
    mago1.atacar();
    mago1.atacarSemArma();
    
  }
}
