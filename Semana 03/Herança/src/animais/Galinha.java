package animais;

public class Galinha extends Animal{
  public Galinha(String nome) {
    super(nome);
  }

  public void botarOvo() {
    System.out.printf("%s botou ovo.\n", getNome());
  }
}
