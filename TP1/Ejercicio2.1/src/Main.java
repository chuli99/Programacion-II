import java.util.LinkedHashSet;
import java.util.Set;
import java.util.HashSet;
import Entidades.Empleado;
import Entidades.EmpleadoSet;
public class Main {
    private static Main main;
    public static void main(String[] args) {
        Main.main = new Main();
        main.arranque();

    }
    public void arranque() {
        Set<Empleado> empleados = new LinkedHashSet<>();
        Empleado empleado1 = new Empleado("Lionel","Messi",60031,15);
        Empleado empleado2 = new Empleado("Lionel","Messi",60031,15);
        Empleado empleado3 = new Empleado("Javier","Mascherano",60032,10);
        Empleado empleado4 = new Empleado("Eduardo","Gomez",60035,2);
        Empleado empleado5 = new Empleado("Enzo","Ferandez",60036,3);

        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        empleados.add(empleado5);

        Set<EmpleadoSet> empleadosSet = new LinkedHashSet<>();
        EmpleadoSet empleadoSet1 = new EmpleadoSet("Lionel","Messi",60031,15);
        EmpleadoSet empleadoSet2 = new EmpleadoSet("Lionel","Messi",60031,15);
        EmpleadoSet empleadoSet3 = new EmpleadoSet("Javier","Mascherano",60032,10);
        EmpleadoSet empleadoSet4 = new EmpleadoSet("Eduardo","Gomez",60035,2);
        EmpleadoSet empleadoSet5 = new EmpleadoSet("Enzo","Ferandez",60036,3);

        empleadosSet.add(empleadoSet1);
        empleadosSet.add(empleadoSet2);
        empleadosSet.add(empleadoSet3);
        empleadosSet.add(empleadoSet4);
        empleadosSet.add(empleadoSet5);

        for (Empleado empleado : empleados);{
            System.out.println(empleados);
        }

        for (EmpleadoSet empleado : empleadosSet){
            System.out.println(empleado);
        }
    }
}