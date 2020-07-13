package tp2;


public class Alumno {

	private String nombre;
	private String apellido;
	private int lu;
	private float nota;
	private float nota2;
    private String aprobado = "Aprobado";
    private String desaprobado = "Desaprobado";
	
	public Alumno(String nombre, String apellido, int lu, float nota, float nota2) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.lu = lu;
		this.nota = nota;
		this.nota2 = nota2;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	public int getLu() {
		return lu;
	}
	
	public void setLu(int lu) {
		this.lu = lu;
	}
	
	public double getNota() {
		return nota;
	}
	
	public void setNota(float nota) {
		this.nota = nota;
	}
	
	public double getNota2() {
		return nota2;
	}
	
	public void setNota2(float nota2) {
		this.nota2 = nota2;
	}
	
	public float promedio(){
        return (nota+nota2)/2; 
    }
	
	public String estado(){
        if(nota>=7 && nota2>=7 && (nota+nota2)/2>=7){
            return aprobado ;
        }
        else{
            return desaprobado;
        }
	}
        
	public void mostrar() {
		System.out.println("Alumno -");
		System.out.println("Nombre y apellido: " + nombre + " " + apellido);
		System.out.println("LU: " + lu + " " + "Notas: " + nota + ", " + nota2);
		System.out.println("Promedio: " + promedio() + " " + estado());
	}
	
}
