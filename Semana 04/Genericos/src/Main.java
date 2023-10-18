import Generics.Tipos;

public class Main {
    public static void main(String[] args) {
        Tipos<Integer, String> obj1 = new Tipos<>(4, "Quatro");
        Tipos<Integer, String> obj2 = new Tipos<>(10, "Dez");

        obj1.mostrarTipo();
        obj2.mostrarTipo();

        System.out.println(obj1);
        System.out.println(obj2);
    }
}