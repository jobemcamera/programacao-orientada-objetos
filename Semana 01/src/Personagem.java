public class Personagem {
  // atributos
  String nome;
  String vocacao;
  int nivel;
  int forca;
  int defesa;
  int velocidade;

  // métodos
  void mostrarStatus() {
    System.out.format("Personagem: %s\nVocação: %s\nNível: %d\nForça: %d\nDefesa: %d\nVelocidade: %d\n\n", nome,
        vocacao, nivel, forca, defesa, velocidade);
  }

  void atacar(String alvo) {
    System.out.format("%s atacou %s e causou %d de dado.\n", nome, alvo, forca);
  }
}
