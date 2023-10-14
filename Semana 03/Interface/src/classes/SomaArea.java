package classes;

public class SomaArea {

  public double somarAreas(FiguraGeometrica figuraA, FiguraGeometrica figuraB) {
    double areaTotal = figuraA.calcularArea() + figuraB.calcularArea();
    return areaTotal;
  }
}
