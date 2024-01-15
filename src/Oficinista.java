import java.util.Scanner;

public class Oficinista extends Empleado {

    private String area;

    public Oficinista() {

    }

    @Override
    public void ingresarInformacion() throws SalarioNegativo,EdadIncorrecta,DatosIncompletos,IdInvalido{
        super.ingresarInformacion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el cargo del empleado:");
        this.area = scanner.next();

        if (area.trim().isEmpty()) {
            throw new DatosIncompletos("El cargo no puede estar vacía para el empleado.");
        }

    }
    @Override
    void mostrarInformacion(){
        super.mostrarInformacion();

        System.out.println("Area: "+area);
    }

    public String getDepartamento() {
        return area;
    }

    public void setDepartamento(String departamento) {
        this.area = departamento;
    }
}
