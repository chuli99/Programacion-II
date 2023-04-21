import java.util.ArrayList;
import java.util.List;
import Figuras.*;
import Interfaces.FiguraGeometrica;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();
    }
        public void arranque(){
        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo(3));
        figuras.add(new Triangulo(3, 4, 5));
        figuras.add(new Rectangulo(2, 4));
        figuras.add(new Circulo(5));
        figuras.add(new Triangulo(6, 8, 10));

        for (FiguraGeometrica figura : figuras) {
            System.out.println(figura);
            System.out.println("Perímetro: " + figura.calcularPerimetro());
            System.out.println("Superficie: " + figura.calcularSuperficie());
            System.out.println();
        }
        }
}