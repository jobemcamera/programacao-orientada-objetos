package Generics;

// int = Integer
// double = Double
// string = String
public class Tipos<T, S> {
    private T ob1;
    private S ob2;

    public Tipos(T ob1, S ob2) {
        this.ob1 = ob1;
        this.ob2 = ob2;
    }

    public void mostrarTipo() {
        System.out.println(ob1.getClass().getName());
        System.out.println(ob2.getClass().getName());
    }

    @Override
    public String toString() {
        return this.ob1 + ", " + this.ob2;
    }
}
