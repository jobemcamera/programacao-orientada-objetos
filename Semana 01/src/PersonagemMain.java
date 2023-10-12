public class PersonagemMain {

  public static void main(String[] args) {
    Personagem personagem1 = new Personagem();
    personagem1.nome = "Rhandy Sawyer";
    personagem1.vocacao = "Royal Paladin";
    personagem1.nivel = 757;
    personagem1.forca = 168;
    personagem1.defesa = 78;
    personagem1.velocidade = 1150;

    personagem1.mostrarStatus();
    personagem1.atacar("Demon");
  }
}
