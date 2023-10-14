import classes.SomaArea;
import classes.Circulo;
import classes.Quadrado;

public class AppFigurasGeometricas {
    public static void main(String[] args) throws Exception {
        Circulo circulo = new Circulo(3);
        System.out.println("Área do círculo: " + circulo.calcularArea());

        Quadrado quadrado = new Quadrado(2);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());

        SomaArea somaArea = new SomaArea();
        System.out.println("Soma das áreas: " + somaArea.somarAreas(circulo, quadrado));
    }
}
