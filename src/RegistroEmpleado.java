import java.util.ArrayList;

public class RegistroEmpleado {
    private ArrayList<Empleado> empleados;
    RegistroEmpleado() {
        empleados = new ArrayList<>();
    }


    void agregarEmpleado(Empleado empleado) {
       boolean ban = false;
       do {
           try {
               empleado.ingresarInformacion();
               ban = false;
               empleados.add(empleado);
               System.out.println("Empleado agregado exitosamente.");
           } catch (SalarioNegativo | EdadIncorrecta | DatosIncompletos | IdInvalido e) {
               System.out.println("Error al agregar empleado: " + e.getMessage());
               ban = true;
           }
       }while (ban);

    }

    void mostrarLosEmpleados() {
        for (Empleado empleado : empleados) {
            empleado.mostrarInformacion();
            System.out.println("--------------------");
        }
    }
}
