package festas;

public class FestaVip {

  // sem modificador informado é default que só é acessado no mesmo pacote
  private int quantidadeCafe = 30;
  private int quantidadeSalgado = 50;

  public void entrar() {
    System.out.format("Quantidade de café: %d\n", quantidadeCafe);
    beberCafe();
    System.out.format("Quantidade de café: %d\n", quantidadeCafe);
    comerSalgado();
    System.out.format("Quantidade de salgados: %d\n", quantidadeSalgado);
    beberCafe();
    System.out.format("Quantidade de café: %d\n", quantidadeCafe);
  }

  // <modificador> <retorno-método> <nome-método>
  private void beberCafe() {
    quantidadeCafe--;
    System.out.println("Bebeu 1 xícara de café");
  }

  private void comerSalgado() {
    quantidadeSalgado = quantidadeSalgado - 5;
    System.out.println("Comeu 5 salgados");
  }
}
