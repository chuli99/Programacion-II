import java.util.ArrayList;
import java.util.List;
import Figuras.*;
import Interfaces.FiguraGeometrica;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();
    }
    public void arranque() {
        List<FiguraGeometrica> figuras = new ArrayList<>();
        figuras.add(new Circulo(4));
        figuras.add(new Cuadrado(4));
        figuras.add(new Triangulo(2, 2, 3, 2, 3));
    for (FiguraGeometrica figura :figuras){
        System.out.println(figura);
            }
        }
    }