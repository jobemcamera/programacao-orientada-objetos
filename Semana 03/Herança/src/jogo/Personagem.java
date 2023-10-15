package jogo;

// classe abstrata nao pode ser instanciada, somente herdada
public abstract class Personagem {
  private String nome;
  private String classe;
  private int nivel;

  public Personagem(String nome) {
    this.nome = nome;
    this.classe = "Nenhuma";
    this.nivel = 1;
  }

  @Override
  public String toString() {
    String informacoes = String.format("%s (nível: %d) - Classe: %s", nome, nivel, classe);
    return informacoes;
  }

  public void atacar() {
    System.out.println("O personagem atacou.");
  }

  // final = metodo final impedindo override
  public final void atacarSemArma() {
    System.out.println("O personagem atacou sem arma.");
  }

  // abstract = metodo sem implementacao
  public abstract void atacarComArma(); 

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getClasse() {
    return classe;
  }

  public void setClasse(String classe) {
    this.classe = classe;
  }

  public int getNivel() {
    return nivel;
  }

  public void setNivel(int nivel) {
    this.nivel = nivel;
  }

}
