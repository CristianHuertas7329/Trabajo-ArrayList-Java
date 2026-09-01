/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paqueteClases;
import java.time.LocalDate;


public class Persona {
    private String nombreCompleto;
    private LocalDate fechaNacimiento;
    private double peso;
    private double altura;
    private String direccion;
    private String telefono;
    private String correoElectronico;

    public Persona(String nombreCompleto, LocalDate fechaNacimiento, 
            double peso, double altura, String direccion, String telefono, 
            String correoElectronico) {
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.peso = peso;
        this.altura = altura;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    
    public int calcularEdad(){
        LocalDate fechaActual = LocalDate.now();
        int edad = fechaActual.getYear() - fechaNacimiento.getYear();
        return edad;
    }
    
    public boolean esMayorDeEdad(){
        if (calcularEdad() >= 18){
            return true;
        } else { return false;}
    }

    // getter y setters
    public String getNombreCompleto() {return nombreCompleto;}
    public void setNombreCompleto(String nombreCompleto) {this.nombreCompleto = nombreCompleto;}
    
    public LocalDate getFechaNacimiento() {return fechaNacimiento;}
    public void setFechaNacimiento(LocalDate fechaNacimiento) {this.fechaNacimiento = fechaNacimiento;}
    
    public double getPeso() {return peso;}
    public void setPeso(double peso) {this.peso = peso;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}
    
    public String getDireccion() {return direccion;}
    public void setDireccion(String direccion) {this.direccion = direccion;}

    public String getTelefono() {return telefono;}
    public void setTelefono(String telefono) {this.telefono = telefono;}

    public String getCorreoElectronico() {return correoElectronico;}
    public void setCorreoElectronico(String correoElectronico) {this.correoElectronico = correoElectronico;}

    
    
    
    
    // metodo constructor vacion
    public Persona(){};
    
    public void mostrarDatos(){
        System.out.println(nombreCompleto);
        System.out.println(fechaNacimiento);
        System.out.println(peso);
        System.out.println(altura);
        System.out.println(telefono);
        System.out.println(correoElectronico);
    }


    
    
    
    
    
}
