package Conjuntos;

import java.util.Objects;

public class Funcionarios {

    private int codigo;
    private String nome;

    public Funcionarios(int codigo, String nome) {
        this.codigo = codigo;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return "{Codigo: " + codigo + " Nome: " + nome + "}";
    }

    // vamos garantir que um funcionario nao seja igual ao outro pelo codigo
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Funcionarios that = (Funcionarios) o;
        return codigo == that.codigo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(codigo);
    }
}
