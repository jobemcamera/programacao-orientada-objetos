import cinema.Filme;

public class PolimorfismoMain {
    public static void main(String[] args) throws Exception {
        // um unico nome pode ter comportamentos diferentes
        Filme filme = new Filme("Matrix");
        filme.play();
        filme.play("Português");
        filme.play("Português", "Inglês");
    }
}
