package Conjuntos;

import java.util.LinkedHashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // programando orientada a interface Set
        Set<Funcionarios> funcionarios = new LinkedHashSet<>();
        funcionarios.add(new Funcionarios(1, "Jobe"));
        funcionarios.add(new Funcionarios(2, "Rafael"));
        funcionarios.add(new Funcionarios(3, "Beto"));
        funcionarios.add(new Funcionarios(4, "Felipe"));
        funcionarios.add(new Funcionarios(1, "Jobe"));  // nao sera executado (equals and hashCode)

        System.out.println(funcionarios);
    }
}
