public class CelularMain {
    public static void main(String[] args) throws Exception {

        // instanceando um objeto "celular1"
        Celular celular1 = new Celular();

        celular1.nome = "iPhone 12";
        celular1.sistemaOperacional = "iOS";
        celular1.tamanhoTela = 6.1f;
        celular1.espacoArmazenamento = 256;

        // instanceando um objeto "celular2"
        Celular celular2 = new Celular();

        celular2.nome = "Galaxy Note 20 Ultra";
        celular2.sistemaOperacional = "Android";
        celular2.tamanhoTela = 6.9f;
        celular2.espacoArmazenamento = 256;

        // instanceando um objeto "celular3"
        Celular celular3 = new Celular();

        celular3.nome = "Xiaomi Mi 11 Pro";
        celular3.sistemaOperacional = "Android";
        celular3.tamanhoTela = 6.81f;
        celular3.espacoArmazenamento = 128;

        System.out.format("Celular %s com tela de %.1f polegadas, com %dGB e sistema operacional %s.\n", celular1.nome,
                celular1.tamanhoTela,
                celular1.espacoArmazenamento, celular1.sistemaOperacional);

        System.out.format("Celular %s com tela de %.1f polegadas, com %dGB e sistema operacional %s.\n", celular2.nome,
                celular2.tamanhoTela,
                celular2.espacoArmazenamento, celular2.sistemaOperacional);

        System.out.format("Celular %s com tela de %.2f polegadas, com %dGB e sistema operacional %s.\n", celular3.nome,
                celular3.tamanhoTela,
                celular3.espacoArmazenamento, celular3.sistemaOperacional);
    }
}
