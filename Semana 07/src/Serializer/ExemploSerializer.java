package Serializer;

import java.io.*;

public class ExemploSerializer {
    public static void main(String[] args) {
        Funcionario e = new Funcionario();
        e.nome = "João da Silva";
        e.endereco = "Rua das Flores";
        e.id = 203040;
        e.numero = 100;
        try {
            FileOutputStream fileOut = new FileOutputStream("funcionario.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(e);
            out.close();
            fileOut.close();
            System.out.printf("Os dados serializados estão salvo no arquivo funcionario.ser");
        } catch (IOException i) {
            System.out.printf(String.valueOf(i));
        }
    }
}
