import Clases.Persona;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;
import java.util.ArrayList;

import static java.lang.Math.random;

public class Main {
    private static Main main;
    public static void main(String[] args) {
        Main.main = new Main();
        main.iniciar();

    }
    public void iniciar(){
        List<String> nombres = new ArrayList<>();
        nombres.add("Paco");
        nombres.add("Lionel");
        nombres.add("Paulo");
        nombres.add("Eduardo");
        nombres.add("Julian");
        List <String> apellidos = new ArrayList<>();
        apellidos.add("Castillo");
        apellidos.add("Espinola");
        apellidos.add("Balda");
        apellidos.add("Ponce");
        apellidos.add("Diaz");
        List<Persona> personas = new ArrayList<>();
        for (int i = 0;i < nombres.size(); i++){
            Persona persona = new Persona();
            persona.setNombre(nombres.get(i));
            persona.setApellido(apellidos.get(i));
            persona.setEdad(6);
            personas.add(persona);

        }
        System.out.println(personas.get(3));

    }
}