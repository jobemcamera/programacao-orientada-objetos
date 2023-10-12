// Importação individual
// import videos.Filme;
// import videos.Serie;
// import videos.Documentario;
// import videos.Animacao;

// Importação de todas as classes do pacote
import br.com.devFlix.gui.*;
import br.com.devFlix.videos.*;

public class App {

  public static void main(String[] args) {
    Filme filme = new Filme();
    Serie serie = new Serie();
    Documentario documentario = new Documentario();
    Animacao animacao = new Animacao();

    Janela janela = new Janela();

  }
}