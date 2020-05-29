package tp;


public class Alumno extends Persona {
    
    public int lu;
    public float nota1;
    public float nota2;
    public String aprobado = "APROBADO";
    public String desaprobado = "DESAPROBADO";
    
    
    public Alumno(String nombre, String apellido, int nroDni, int anioNacimiento, int lu, float nota1, float nota2){
        
        super(nombre, apellido, nroDni, anioNacimiento);
        this.lu = lu;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    
    public int getLu(){
        return this.lu;
    }
    
    public void setLu(int lu){
        this.lu = lu;
    }
    
    public float getNota1(){
        return this.nota1;
    }
    
    public void setNota1(int nota1){
        this.nota1 = nota1;
    }
    
    public float getNota2(){
        return this.nota2;
    }
    
    public void setNota2(int nota2){
        this.nota2 = nota2;
    }
    
    private float promedio(){
        return (nota1+nota2)/2; 
    }
    
    private String estado(){
        if(nota1>=7 && nota2>=7 && (nota1+nota2)/2>=7){
            return aprobado ;
        }
        else{
            return desaprobado;
        }
    }
    
    @Override
    public void mostrar(){
        System.out.println("Nombre y Apellido: " + nombre +" "+ apellido);
        System.out.println("DNI: " + nroDni + " " + "Edad: " + edad() + " años");
        System.out.println("LU: "+ lu + " " + "Notas: "+ nota1 + " - " + nota2);
        System.out.println("Promedio: "+ promedio() + " - " + estado());
    }
}

