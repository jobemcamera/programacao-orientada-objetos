package Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // programando orientado a interface Map
        Map<String, Double> cupons = new HashMap<>();
        cupons.put("CP1", 12.00);
        cupons.put("CP2", 10.00);
        cupons.put("CP3", 8.00);
        cupons.put("CP4", 6.00);
        // cupons.put("CP1", 4.00);    // nao permite chaves duplicadas => ATUALIZA

        Double valor = cupons.get("CP1");   // retorna null se nao houver a chave
        System.out.println(valor);

        boolean contem =  cupons.containsKey("CP1");
        System.out.println(contem);

        Set<String> chaves = cupons.keySet();   // HashMap nao garante a ordem das chaves (TreeMap garante)
        System.out.println(chaves);

        for (Map.Entry<String, Double> chaveValor : cupons.entrySet()) {
            System.out.println(chaveValor.getKey() + " : " + chaveValor.getValue());
        }
    }
}
