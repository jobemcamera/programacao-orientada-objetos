package jogo;

public class Mago extends Personagem {
  private String arma;

  public Mago(String nome) {
    super(nome);
    setClasse("Mago");
    setNivel(2);
    this.arma = "cajado";
  }

  @Override
  public String toString() {
    String informacaoPersonagem = super.toString(); // herdando toString da classe pai Personagem
    String informacaoMago = String.format(" - Arma: %s", arma);
    return informacaoPersonagem + informacaoMago;
  }


  @Override
  public void atacarComArma() {
    System.out.printf("O mago atacou com %s.\n", arma);
  }
}
