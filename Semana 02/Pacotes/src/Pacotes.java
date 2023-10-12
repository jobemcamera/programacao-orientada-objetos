// Importação individual
// import videos.Filme;
// import videos.Serie;
// import videos.Documentario;
// import videos.Animacao;

// Importação de todas as classes do pacote
import br.com.devFlix.gui.*;
import br.com.devFlix.videos.*;

public class Pacotes {

  public static void main(String[] args) {
    Filme filme = new Filme();
    Serie serie = new Serie();
    Documentario documentario = new Documentario();
    Animacao animacao = new Animacao();

    Janela janela = new Janela();

    System.out.println(filme);
    System.out.println(serie);
    System.out.println(documentario);
    System.out.println(animacao);
    System.out.println(janela);
  }
}