package classes;

public class Pessoa {
  private String nome;
  private int idade;
  private double altura;

  // Método Construtor
  // <modificador> <nomeClasse>()

  // Nenhum parâmetro
  public Pessoa() {
    System.out.println("Pessoa nasceu!");
    nome = "Sem nome";
    idade = 0;
    altura = 0;
  }

  // Dois parâmetro
  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }

  // Três parâmetro
  public Pessoa(String nome, int idade, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.altura = altura;
  }

  // Um parâmetro
  public Pessoa(String nome) {
    this.nome = nome;
  }

  public void imprimirDados() {
      System.out.println("Nome: " + nome);
      System.out.println("Idade: " + idade);
      System.out.println("Altura: " + altura);       
  }

  // Setters e Getters
  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    if (idade < 0) {
      System.out.println("Idade precisa ser maior que 0.");
      return;
    }

    this.idade = idade;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

}
