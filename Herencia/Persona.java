package tp;

import java.util.Calendar;
import java.util.GregorianCalendar;
        

public class Persona {
    
    public int nroDni;
    public int anioNacimiento;
    public String nombre;
    public String apellido;
    Calendar fechaHoy = new GregorianCalendar();
    int anioHoy = fechaHoy.get(Calendar.YEAR);
    
    
    
    public Persona(String nombre, String apellido, int nroDni, int anioNacimiento){
    	this.nombre = nombre;
        this.apellido = apellido;
    	this.nroDni = nroDni;
        this.anioNacimiento = anioNacimiento;
    }
    
    
    public int getNrodni(){
        return this.nroDni;
    }
    
    public void setNrodni(int nroDni){
        this.nroDni = nroDni;
    }
    
    public int getAnionacimiento(){
        return this.anioNacimiento;
    }
    
    public void setAnionacimiento(int anioNacimiento){
        this.anioNacimiento = anioNacimiento;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getApellido(){
        return this.apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    
    private int edad(){
        return anioHoy-anioNacimiento;
    }
    
    public String nomYApe(String nombre, String apellido){
        return this.nombre + " " + this.apellido; 
    }
    
     public String apeYNom(String nombre, String apellido){
        return this.apellido + " " + this.nombre; 
    }
     
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nombre +" "+ apellido);
        System.out.println("DNI: " + nroDni + " " + "Edad: " + edad() + " años");
    }
    
}

