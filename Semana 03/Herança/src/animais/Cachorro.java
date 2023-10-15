package animais;

public class Cachorro extends Animal {
  public Cachorro(String nome) {
    super(nome);
  }

  public void latir() {
    System.out.printf("%s latiu.\n", getNome());
  }

  public void sentar() {
    System.out.printf("%s sentou.\n", getNome());
  }
}
