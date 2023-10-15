package animais;

public class Animal {
  private String nome;

  public Animal(String nome) {
    this.nome = nome;
  }

  public void comer() {
    String mensagem = String.format("%s comeu.", nome);
    System.out.println(mensagem);
  }

  public void beber() {
   String mensagem = String.format("%s bebeu.", nome);
    System.out.println(mensagem);
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}
