import java.util.Scanner;

public class Encargado extends  Empleado{
     private String cargo;


    public Encargado() {

    }

    @Override
    public void ingresarInformacion() throws SalarioNegativo,EdadIncorrecta,DatosIncompletos,IdInvalido{
        super.ingresarInformacion();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el cargo del empleado:");
        this.cargo= scanner.nextLine();
        System.out.println("Cargo: "+cargo);


        if (cargo.trim().isEmpty()) {
            throw new DatosIncompletos("El area no puede estar vacía para el empleado.");
        }
    }
    @Override
    void mostrarInformacion(){
        super.mostrarInformacion();
        System.out.println("Cargo: " + cargo);

    }


    public String getDeparatamento() {
        return cargo;
    }

    public void setDeparatamento(String deparatamento) {
        this.cargo = deparatamento;
    }
}
