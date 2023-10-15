import series.Serie;

public class SerieMain {
  public static void main(String[] args) throws Exception {
    Serie serie1 = new Serie("The Boys", 3, 2019);
    Serie serie2 = new Serie("Stranger Things", 4, 2016);

    // System.out.println(serie1.toString());  // explicita
    System.out.println(serie1);             // implicita
    System.out.println(serie2);  
  }
}
