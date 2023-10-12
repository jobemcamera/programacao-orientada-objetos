import classes.Pessoa;

public class Construtor {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.setNome("Jobe");
        pessoa1.setIdade(29);
        pessoa1.setAltura(1.72);
        pessoa1.imprimirDados();

        Pessoa pessoa2 = new Pessoa("Rafael");
        pessoa2.setIdade(25);
        pessoa2.setAltura(1.65);
        pessoa2.imprimirDados();

        Pessoa pessoa3 = new Pessoa("João", 35);
        pessoa3.setAltura(1.57);
        pessoa3.imprimirDados();

        Pessoa pessoa4 = new Pessoa("Pedro", 53, 1.89);
        pessoa4.imprimirDados();

    }
}
