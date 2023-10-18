import java.util.*;

public class Main {
    public static void main(String[] args) {
        // ARRAY LIST
        ArrayList<String> nomesList = new ArrayList<String>();

        System.out.println("\n----ArrayList----\n");

        nomesList.add("Jobe");

        String primeiroNome = nomesList.get(0);
        System.out.println("Primeiro nome: " + primeiroNome);

        nomesList.set(0, "Rafael");
        nomesList.remove(0);

        nomesList.add("Jobe");

        int tamanho = nomesList.size();
        System.out.println("Tamanho da lista: " + tamanho);

        boolean contemJobe = nomesList.contains("Jobe");
        System.out.println("A lista contém 'Jobe'? " + contemJobe);

        boolean estaVazia = nomesList.isEmpty();
        System.out.println("A lista está vazia? " + estaVazia);

        int indiceJobe = nomesList.indexOf("Jobe");
        System.out.println("Índice de 'Jobe': " + indiceJobe);

        Collections.sort(nomesList);
        nomesList.clear();

        // LINKEDLIST
        LinkedList<String> nomesLinked = new LinkedList<String>();

        System.out.println("\n----LinkedList----\n");

        nomesLinked.addFirst("Jobe");
        nomesLinked.addLast("Rafael");

        System.out.println("Primeiro nome: " + nomesLinked.getFirst());
        System.out.println("Último nome: " + nomesLinked.getLast());

        nomesLinked.removeFirst();
        nomesLinked.removeLast();

        // HASHSET
        HashSet<String> tags = new HashSet<String>();

        System.out.println("\n----HashSet----\n");

        tags.add("Programação");
        tags.add("Orientada");
        tags.add("Objetos");
        tags.add("Programação"); // não será adicionada pois já existe

        System.out.println("HashSet: " + tags.toString());

        // HASHMAP
        HashMap<Integer, String> produtos = new HashMap<Integer, String>();

        System.out.println("\n----HashMap----\n");

        produtos.put(1, "Mouse");
        produtos.put(2, "Teclado");
        produtos.put(3, "Monitor");
        produtos.put(4, "Webcam");
        produtos.put(5, "Impressora");
        produtos.put(5, "Scanner"); // vai substituir "Impressora"

        for (Map.Entry<Integer, String> produto : produtos.entrySet()) {
            System.out.format("%d: %s%n", produto.getKey(), produto.getValue());
        }

    }
}