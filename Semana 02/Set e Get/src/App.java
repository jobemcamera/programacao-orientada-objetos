import classes.Conta;
import classes.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // Classe Pessoa
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Jobe");
        pessoa.setIdade(29);
        pessoa.setAltura(172);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getIdade());

        pessoa.setNome("Rafael");
        pessoa.setIdade(25);
        pessoa.setAltura(168);
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getAltura());
        System.out.println(pessoa.getIdade());

        System.out.println("\n----------------------------\n");

        // Classe Conta
        Conta conta = new Conta();

        System.out.println("Saldo: " + conta.getSaldo());
        conta.depositar(200);
        System.out.println("Saldo: " + conta.getSaldo());

        conta.sacar(150);
        System.out.println("Saldo: " + conta.getSaldo());
    }
}
