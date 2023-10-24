import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        System.out.println("------HashSet------");
        Set<String> nomesHash =  new HashSet<>();   // nao garante a ordem de insercao
        nomesHash.add("Jobe");
        nomesHash.add("Jobe");  // nao permite duplicacao de conteudo
        nomesHash.add("Rafael");
        nomesHash.add("Beto");
        System.out.println(nomesHash);  // out:[Beto, Rafael, Jobe]

        System.out.println("------LinkedHashSet------");
        Set<String> nomesLinked =  new LinkedHashSet<>(); // garante a ordem de insercao
        nomesLinked.add("Jobe");
        nomesLinked.add("Jobe");  // nao permite duplicacao de conteudo
        nomesLinked.add("Rafael");
        nomesLinked.add("Beto");
        System.out.println(nomesLinked);  // out:[Jobe, Rafael, Beto]

        System.out.println("------TreeSet------");
        Set<String> nomesTree = new TreeSet<>();    // garante a ordem alfabetica
        nomesTree.add("Jobe");
        nomesTree.add("Jobe");  // nao permite duplicacao de conteudo
        nomesTree.add("Rafael");
        nomesTree.add("Beto");
        System.out.println(nomesTree);  // out:[Beto, Rafael, Jobe]


        }
    }
