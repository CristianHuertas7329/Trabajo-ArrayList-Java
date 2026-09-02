package PracticaMain;
import java.time.LocalDate;
import paqueteClases.*;
import java.util.ArrayList;
import java.util.Scanner;

public class principal {
    private static ArrayList<Persona> listaPersonas = new ArrayList<>();
    private static Scanner entrada = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int opcion;
        
        // menu principal
        do {
            System.out.println("SISTEMA PRINCIPAL");
            System.out.println("1. Registrar persona");
            System.out.println("2. mostrar personas registrardas");
            System.out.println("3. buscar por nombre");
            System.out.println("4. salir");
            System.out.print("ingrese una opcion: ");
            opcion= entrada.nextInt();
            entrada.nextLine();
            
            
            switch (opcion){
                case 1: registrarPersonas();
                    break;
                case 2: mostrarPersona();
                    break;
                case 3: buscarPersona();
                    break;
                case 4: System.out.println("Gracias por usar la vaina");
                    break;
                default: System.out.println("ingrese una opcion valida");
            }
            
            
        } while (opcion != 4);
        
        
    }
    
    public static void registrarPersonas(){
        Persona persona1 = new Persona();
        
        // ingreso de datos
        System.out.println("Ingrese los datos de la persona");
        System.out.println("\n");
        
        // nombre
        System.out.print("Nombre completo: ");
        persona1.setNombreCompleto(entrada.nextLine());
        
        // fecha de nacimiento
        System.out.println("fecha de nacimiento (DD/MM/YYYY): ");
        System.out.print("Ingrese el Dia: ");
        int dia = entrada.nextInt();
        entrada.nextLine();
        System.out.print("Ingrese el Mes (01 - 12): ");
        int mes = entrada.nextInt();
        entrada.nextLine();
        System.out.print("ingrese el Año: ");
        int año = entrada.nextInt();
        entrada.nextLine();
        persona1.setFechaNacimiento(LocalDate.of(año, mes, dia));
        
        if (!persona1.esMayorDeEdad()){
            System.out.println("La persona no es mayor de edad, no sera registrada");
            return;
        }
        // System.out.println("nacio el: " + persona1.getFechaNacimiento());
        
        // peso
        System.out.print("Ingrese el peso en KG: ");
        persona1.setPeso(entrada.nextDouble());
        entrada.nextLine();
        
        // System.out.println(String.format("%.2f", persona1.getPeso()));
        
        // altura
        System.out.print("Ingrese la altura en metros (ej. 1.30): ");
        persona1.setAltura(entrada.nextFloat());
        entrada.nextLine();
        
        // direccion
        System.out.print("Ingrese su direccion: ");
        persona1.setDireccion(entrada.nextLine());
        
        // telefonod
        System.out.print("Ingrese el numero de telefono: ");
        persona1.setTelefono(entrada.nextLine());
        
        //correo
        System.out.print("Ingrese el correo electronico: ");
        persona1.setCorreoElectronico(entrada.nextLine());
        
        //guardar cambios
        System.out.println("\n");
        listaPersonas.add(persona1);
        System.out.println("Persona registrada con exito \n");
        
    }
    
    public static void mostrarPersona(){
        if (listaPersonas.isEmpty()){
            System.out.println("no se ha agregado ninguna persona \n");
        } else {
            System.out.println("========= LISTA PERSONAS REGISTRADAS =========");
            for (int i = 0; i < listaPersonas.size(); i++){
                System.out.println("Registro #" + i + 1 + "\n");
                System.out.println("Nombre Completo: " + listaPersonas.get(i).getNombreCompleto());
                System.out.println("Fecha de nacimiento: " + listaPersonas.get(i).getFechaNacimiento());
                
            }
            
        }
        
    }
    
    public static void buscarPersona(){
        
        
    }
    
}
