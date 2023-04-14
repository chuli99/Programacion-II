import Clases.Empleado;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.arranque();

    }
    public void arranque(){
        List<Empleado> empleados = new ArrayList<Empleado>();
        empleados.add(new Empleado("Lionel","Messi",60031,15));
        empleados.add(new Empleado("Lionel", "Messi", 60031, 15));
        empleados.add(new Empleado("Javier","Mascherano",60032,10));
        empleados.add(new Empleado("Eduardo","Gomez",60035,2));
        empleados.add(new Empleado("Enzo","Ferandez",60036,3));

        Map<String, Empleado> empleadoMap = new HashMap<String, Empleado>();

        //e es el empleado en lista
        for (Empleado e : empleados){
            String key = e.getApellido()+","+e.getNombre();
            empleadoMap.put(key,e);
        }

        for(Map.Entry<String, Empleado> empleadoEntry: empleadoMap.entrySet() ){
            System.out.printf("Clave: "+ empleadoEntry.getKey() +" Valor: "+empleadoEntry.getValue());
            System.out.println("a");
        }

    }
}