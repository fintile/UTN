
package tp;


public class Empleado extends Persona {
    
    public long cuil;
    public int antiguedad;
    public double sueldoNeto;
    
    
    public Empleado(String nombre, String apellido, int nroDni, int anioNacimiento, long cuil, int antiguedad, double sueldoNeto){
        super(nombre, apellido, nroDni, anioNacimiento);
        this.cuil = cuil;
        this.antiguedad = antiguedad;
        this.sueldoNeto = sueldoNeto;
    }
    
    public long getCuil(){
        return this.cuil;
    }
    
    public void setCuil(long cuil){
        this.cuil = cuil;
    }
    
    public int getAntiguedad(){
        return this.antiguedad;
    }
    
    public void setAntiguedad(int antiguedad){
        this.antiguedad = antiguedad;
    }
    
    public double getSueldoNeto(){
        return this.sueldoNeto;
    }
    
    public void setSueldoNeto( double sueldoNeto){
        this.sueldoNeto = sueldoNeto;
    }
    
    @Override
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nombre +" "+ apellido);
        System.out.println("DNI: " + nroDni + " " + "Edad: " + edad() + " años");
        System.out.println("CUIL: " + cuil + " Antiguedad: " + antiguedad + " años de servicio");
        System.out.println("Sueldo Neto: " + sueldoNeto);
    }
    
}

