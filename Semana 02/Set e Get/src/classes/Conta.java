package classes;

public class Conta {
  private double saldo = 0;

  public void depositar(double valor) {
    if (valor < 0) {
      System.out.println("Você deve depositar um valor positivo.");
      return;
    }
    saldo = saldo + valor;
  }

  public void sacar(double valor) {
    if (saldo < valor) {
      System.err.println("Você não possui esse saldo.\n");
      return;
    }
    saldo = saldo - valor;
  }

  public double getSaldo() {
    return saldo;
  }

}
