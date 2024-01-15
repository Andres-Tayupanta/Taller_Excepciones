import java.util.Scanner;

public class Empleado {
    private String nombre;
    private int id ;
    int edad;
    private String correo;
     double salario;

    public Empleado(String nombre, int id, int edad,String correo,double salario) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.correo = correo;
        this.salario =salario;
    }

    public Empleado() {
    }

    public void ingresarInformacion() throws SalarioNegativo,EdadIncorrecta,DatosIncompletos,IdInvalido{
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Ingrese el nombre del empleado:");
        this.nombre = scanner.nextLine();
        if (this.nombre.trim().isEmpty()) {
            throw new DatosIncompletos("El nombre no puede estar vacío para el empleado.");
        }


           System.out.println("Ingrese el ID del empleado:");
           String idIngresado= scanner.nextLine();
           if (idIngresado.trim().isEmpty()) {
               throw new DatosIncompletos("El ID no puede estar vacío para el empleado.");
           }
         if (idIngresado.length() != 12) {
            throw new IdInvalido("La longitud del ID debe ser de 12 caracteres.");
         }

           try {
               this.id = Integer.parseInt(idIngresado);
               if (this.id <= 0) {
                   throw new IdInvalido("ID inválido ingresado para el empleado.");
               }

           } catch (NumberFormatException e) {
               throw new IdInvalido("ID inválido ingresado para el empleado."+e);
           }



        System.out.println("Ingrese la edad del empleado:");
        String edadIngresada = scanner.nextLine();
        if (edadIngresada.trim().isEmpty()){
            throw new DatosIncompletos("No puede dejar vacio este espacio");
        }
        try {
            this.edad = Integer.parseInt(edadIngresada);
            if (this.edad < 0 || this.edad >=60 ) {
                throw new EdadIncorrecta("Edad invalida ");
            }
        }catch (NumberFormatException  e){
            {
                throw new DatosIncompletos("Edad inválida ");
            }
        }
        System.out.println("Ingrese el correo del empleado:");
        this.correo = scanner.next();

        System.out.println("Ingrese el salario del empleado:");
        String salarioIngresado = scanner.next();
        if (salarioIngresado.trim().isEmpty()) {
            throw new DatosIncompletos("Salario no puede estar vacío ");
        }
        try {
            this.salario = Double.parseDouble(salarioIngresado);
            if (this.salario < 0) {
                throw new SalarioNegativo("El salario no puede ser negativo ");
            }
        } catch (NumberFormatException e) {
            throw new DatosIncompletos("Salario inválido "+e);
        }
    }



    void mostrarInformacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("ID: "+id);
        System.out.println("Edad: "+edad);
        System.out.println("Correo: "+correo);
        System.out.println("Salario: "+salario);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
